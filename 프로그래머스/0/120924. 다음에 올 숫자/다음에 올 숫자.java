class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        if(common[1]-common[0] == common[len-1]-common[len-2]) // 등차수열이면
        {
             answer = common[len-1]+(common[1]-common[0]);
        }
        else // 등비수열이면
        {
             answer = common[len-1]*(common[1]/common[0]);
        }
        return answer;
    }
}