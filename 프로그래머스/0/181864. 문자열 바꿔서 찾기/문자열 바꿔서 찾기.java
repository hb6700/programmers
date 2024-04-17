class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = myString.replaceAll("A", "O").replaceAll("B", "A").replaceAll("O", "B");
        if(str.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}