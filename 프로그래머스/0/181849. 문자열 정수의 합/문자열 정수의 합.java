class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i=0 ; i<num_str.length() ; i++){
            char c = num_str.charAt(i);
            int n = Integer.parseInt(String.valueOf(c));
            answer += n;
        }
        return answer;
    }
}