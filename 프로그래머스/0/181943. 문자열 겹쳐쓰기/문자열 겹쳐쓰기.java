class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i=0 ; i<s ; i++){
            answer += arr[i];
        }
        answer += overwrite_string;
        for(int i=answer.length() ; i<my_string.length() ; i++){
            answer += arr[i];
        }
        return answer;
    }
}