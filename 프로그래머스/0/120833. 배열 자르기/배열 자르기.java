import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int max = num2 - num1;
        int[] answer = new int[max];
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}