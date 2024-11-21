import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 전체 예산은 정해져있음
        // 각 부서가 신청한 금액만큼은 전액 지원해야함
        // 최대한 많은 부서에 지원
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i < d.length; i++) {
            if(budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}