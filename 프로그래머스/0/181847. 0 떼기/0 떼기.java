class Solution {
    public String solution(String n_str) {
        String answer = "";
        for(int i=0 ; i<n_str.length() ; i++){
            char c = n_str.charAt(i);
            if(c != '0'){
                answer = n_str.substring(i);
                break;
            }
        }
        return answer;
    }
}