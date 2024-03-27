class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String result1 = String.valueOf(a) + String.valueOf(b);
        String result2 = String.valueOf(b) + String.valueOf(a);
        
        if(Integer.parseInt(result1) >= Integer.parseInt(result2)){
            answer = Integer.parseInt(result1);
        } else {
            answer = Integer.parseInt(result2);
        }
        
        return answer;
    }
}