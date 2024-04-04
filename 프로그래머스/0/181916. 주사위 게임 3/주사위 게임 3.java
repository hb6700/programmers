import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);
        
        if(dice[0] == dice[3]){ 
            //4개 일치
            answer = dice[0] * 1111;
        } else if((dice[0] != dice[3]) && ((dice[0] == dice[1]) && (dice[1] == dice[2]))) {        
            //3개 일치
            answer = (int)Math.pow((10 * dice[0] + dice[3]), 2);
        } else if((dice[0] != dice[3]) && ((dice[1] == dice[2]) && (dice[2] == dice[3]))) {        
            //3개 일치
            answer = (int)Math.pow((10 * dice[3] + dice[0]), 2);
        } else if((dice[0] == dice[1]) && (dice[2] == dice[3])) {
            //2개 일치
            answer = (dice[0] + dice[2]) * ((int)Math.abs(dice[0] - dice[2]));
        } else if(dice[0] == dice[1]) {
            //1개 일치
            answer = dice[2] * dice[3];
        } else if(dice[0] == dice[2]) {
            //1개 일치
            answer = dice[1] * dice[3];
        } else if(dice[0] == dice[3]) {
            //1개 일치
            answer = dice[1] * dice[2];
        } else if(dice[1] == dice[2]) {
            //1개 일치
            answer = dice[0] * dice[3];
        } else if(dice[1] == dice[3]) {
            //1개 일치
            answer = dice[0] * dice[2];
        } else if(dice[2] == dice[3]) {
            //1개 일치
            answer = dice[0] * dice[1];
        } else {
            //불일치
            answer = dice[0];
        }
        return answer;
    }
}