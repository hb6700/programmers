import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] word = my_string.split("");
        
        for(int i=0 ; i<indices.length ; i++){
            word[indices[i]] = "";
        }
        
        for(String x : word){
            answer += x;
        }
        return answer;
    }
}