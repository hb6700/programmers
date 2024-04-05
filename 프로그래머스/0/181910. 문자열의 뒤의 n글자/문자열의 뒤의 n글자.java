class Solution {
    public String solution(String my_string, int n) {
        int start = my_string.length() - n;
        String answer = my_string.substring(start);
        return answer;
    }
}