class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        } else{
            int arr1_sum = 0, arr2_sum = 0;
            for(int a : arr1){
                arr1_sum += a;
            }
            for(int b : arr2){
                arr2_sum += b;
            }
            
            if(arr1_sum > arr2_sum){
                answer = 1;
            } else if(arr1_sum < arr2_sum){
                answer = -1;
            } else {
                answer = 0;                
            }
        }
        return answer;
    }
}