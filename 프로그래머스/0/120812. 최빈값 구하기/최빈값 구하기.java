class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1000];        // index의 길이를 수정함.
        int max = Integer.MIN_VALUE;        // 최대값 저장, 초기값은 정수형의 최소값으로 지정.
        
        for(int i=0; i<array.length; i++){
           index[array[i]]++;
        }
        
        for(int i=0; i<index.length; i++){
            if( max<index[i] ){ 
                max = index[i];             // 최대값
                answer = i ;                // mode:최빈값 
            } else if(max == index[i]) {    // 여러개인지
                answer = -1;
            }
        }
        return answer;
    }
}