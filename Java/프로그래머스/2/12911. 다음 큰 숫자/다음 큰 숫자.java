class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = n;
        int cnt1 = 0;
        int cnt2 = 0;
        while(number != 0){
            if(number % 2 == 1){
                cnt1++;
            }   
            number = number/2;
        }
        
        for(int i = n+1; i <= 1000000; i++){
            for(int j = i; j != 0;){
                if(j % 2 == 1){
                    cnt2++;
                }
                j = j/2;
            }
            if(cnt1 == cnt2){
                answer = i;
                return answer;
            }
            cnt2 = 0;
        }
        return answer;
    }
}