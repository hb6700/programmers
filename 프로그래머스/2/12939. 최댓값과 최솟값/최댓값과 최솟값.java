import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        
        for(int i=0 ; i<num.length ; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(num);
        
        int min = num[0];
        int max = num[num.length - 1];
        
        return min + " " + max;
    }
}