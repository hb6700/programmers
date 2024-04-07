class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String[] word = new String[my_string.length()/m];
        for(int i=0 ; i<word.length ; i++){
            word[i] = my_string.substring(i*m, (i+1)*m);
            if(c <= word[i].length()){
                answer += word[i].charAt(c-1);                
            }
        }
        return answer;
    }
}