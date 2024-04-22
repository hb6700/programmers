import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int[][] array = new int[rank.length][2];
        for(int i=0 ; i<rank.length ; i++){
            array[i][0] = rank[i];      //순위
            array[i][1] = i;            //배열 위치(순번)
        }
        
        //2차원배열 정렬(순위)
        Arrays.sort(array, (o1, o2) -> o1[0]-o2[0]);
        
        int[] answer = new int[3];
        int count = 0, student = 0;
        
        for(int i=0 ; i<array.length ; i++){
            if(attendance[array[i][1]]){
                answer[count++] = array[i][1];
                student++;
            }
            if(student == answer.length){
                break;
            }
        }
        return answer[0]*10000 + answer[1]*100 + answer[2];
    }
}