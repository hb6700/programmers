class Solution {
    public int solution(String binomial) {
        String[] formula = binomial.split(" ");
        int answer = 0;
        if(formula[1].equals("+")){
            answer = Integer.parseInt(formula[0]) + Integer.parseInt(formula[2]);
        } else if(formula[1].equals("-")){
            answer = Integer.parseInt(formula[0]) - Integer.parseInt(formula[2]);
        } else if(formula[1].equals("*")){
            answer = Integer.parseInt(formula[0]) * Integer.parseInt(formula[2]);
        }
        return answer;
    }
}