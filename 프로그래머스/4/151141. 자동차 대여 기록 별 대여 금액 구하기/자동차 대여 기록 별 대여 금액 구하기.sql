SELECT C.HISTORY_ID, 
       ROUND((DATEDIFF(END_DATE, START_DATE)+1)*(C.DAILY_FEE*(100-COALESCE(DISCOUNT_RATE, 0)))/100, 0) AS FEE
FROM (
        SELECT A.HISTORY_ID, B.CAR_TYPE, B.DAILY_FEE, A.START_DATE, A.END_DATE,
               CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 90 THEN "90일 이상"
                    WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 30 THEN "30일 이상"
                    WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 7 THEN "7일 이상"
                    END  AS DUARATION
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS A
        LEFT JOIN CAR_RENTAL_COMPANY_CAR AS B
        ON A.CAR_ID = B.CAR_ID
        WHERE B.CAR_TYPE = '트럭'
    ) AS C
LEFT JOIN (
            SELECT DURATION_TYPE, DISCOUNT_RATE
            FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
            WHERE CAR_TYPE = '트럭'
          ) AS D
ON C.DUARATION = D.DURATION_TYPE
ORDER BY FEE DESC, HISTORY_ID DESC;