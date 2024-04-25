class Solution {
    public int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;
        if(x > y){
            int[][] answer = new int[x][x];
            for(int i=0 ; i<x ; i++){
                for(int j=0 ; j<y ; j++){
                    answer[i][j] = arr[i][j];
                }
                answer[i][y] = 0;
            }
            return answer;
        } else if(x < y) {
            int[][] answer = new int[y][y];
            for(int i=0 ; i<y ; i++){
                for(int j=0 ; j<x ; j++){
                    answer[j][i] = arr[j][i];
                }
                answer[x][i] = 0;
            }
            return answer;
        } else {
            return arr;
        }
    }
}