import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;
        for(int i=0 ; i<commands.length ; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int[] list = new int[end - start + 1];
            int k = 0;
            for(int j=start ; j<=end ; j++){
                list[k++] = array[j-1];
            }
            Arrays.sort(list);
            answer[n++] = list[commands[i][2] - 1];
        }
        return answer;
    }
}