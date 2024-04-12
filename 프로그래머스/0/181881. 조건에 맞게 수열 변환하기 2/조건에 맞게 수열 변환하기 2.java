import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int count = 0;
        while(true){
            int[] copyArr = arr.clone();
            for(int i=0 ; i<arr.length ; i++){
                if(copyArr[i] >= 50 && copyArr[i] % 2 == 0){
                    arr[i] /= 2;
                } else if(copyArr[i] < 50 && copyArr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if(Arrays.equals(arr, copyArr)){
               break; 
            }
            count++;
        }
        return count;
    }
}