class Solution {
    public int solution(int[] num_list) {
        int answer = 0, sum = 0, mul = 1;
        for(int i=0 ; i<num_list.length ; i++){
            sum += num_list[i];
            mul *= num_list[i];
        }
        
        sum = (int)Math.pow(sum, 2);
        
        if(sum > mul){
            answer = 1;
        } else if(sum < mul){
            answer = 0;
        }
        
        return answer;
    }
}