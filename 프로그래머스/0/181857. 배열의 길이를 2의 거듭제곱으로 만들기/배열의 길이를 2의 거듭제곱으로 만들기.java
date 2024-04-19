class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int tmp = 1;
        while(n > tmp){
            tmp *= 2;
        }
        
        int[] answer = new int[tmp];        
        
        for(int i=0 ; i<n ; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}