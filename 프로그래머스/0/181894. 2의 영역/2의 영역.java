import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1, lastIndex = -1;   
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 2){
                if(firstIndex == -1){
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        if(firstIndex == -1) {
            list.add(-1);
        } else if(firstIndex == lastIndex) {
            list.add(2);
        } else {
            for(int i=firstIndex ; i<=lastIndex ; i++){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}