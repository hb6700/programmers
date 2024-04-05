import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();
        
        for(int i=0 ; i<intStrs.length ; i++){
            String str = intStrs[i].substring(s, s + l);
            int num = Integer.parseInt(str);
            
            if(num > k){
                resultList.add(num);
            }
        }
        return resultList;
    }
}
