class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string.substring(s, e+1);
        String reverse = "";
        for(int i=str.length()-1 ; i>=0 ; i--){
            reverse += str.charAt(i);
        }
        String answer = my_string.substring(0, s) + reverse + my_string.substring(e+1);
        return answer;
    }
}