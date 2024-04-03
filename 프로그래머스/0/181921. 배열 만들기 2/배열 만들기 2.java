import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i=l ; i<=r ; i++){
            String num = String.valueOf(i);
            String[] numArr = num.split("");
            int count = 0;
            for(int j=0 ; j<numArr.length ; j++){
                if(numArr[j].equals("0") || numArr[j].equals("5")){
                    count++;
                }
            }
            if(count == numArr.length){
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0){
            answer = new int[]{-1};
            return answer;
        }
        return answer;
    }
}