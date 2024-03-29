class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && a!=c && b!=c){
            //다 다를때
            answer = a + b + c;
        } else if(a==b && a==c){
            //다 같을때
            answer = (a+b+c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else{
            //나머지(2개 일치)
            answer = (a+b+c) * (a*a + b*b + c*c);
        }
        return answer;
    }
}