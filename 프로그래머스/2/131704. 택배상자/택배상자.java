import java.util.*;
 
class Solution {
    public int solution(int[] order) {
        int answer = 0 ;
 
        Stack<Integer> stack = new Stack<>();
        int idx = 0;        
        
        for(int i = 1 ; i <= order.length ; i++) {
            if(order[idx] != i) {    // 배열의 idx번째 원소가 될 때까지 스택에 값 넣음
                stack.push(i);
            }
            else {    // 배열의 idx번째 원소값과 같아지면, 일치하는 것이므로 정답 +1하고, 다음 원소 찾기 위해 idx도 +1
                idx++;
                answer++;
            }
            
            // 스택이 공집합이 아닐 때까지 & 맨 위 원소가 현재 위치 원소와 같다면, 정답 +1
            while(!stack.isEmpty() && stack.peek() == order[idx]) {
                stack.pop();
                idx++;
                answer++;
            }
        }
        
        return answer;
    }
}