import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();        //귤 종류, 갯수
    
        //1. 귤 종류와 갯수 저장하기
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        //2. map 갯수가 많은 순으로 정렬
        List<Integer> list = new ArrayList<>(map.values());
        list.sort((o1, o2) -> o2 - o1);
        
        //3. map 돌면서 가능한 경우의 최솟값 찾기
        int sum = 0, min = 0;       //귤 개수, 최솟값
        
        for(int i : list){
            if(sum + i >= k){
                min++;
                break;
            } else {
                sum += i;
                min++;
            }
        }
        return min;
    }
}