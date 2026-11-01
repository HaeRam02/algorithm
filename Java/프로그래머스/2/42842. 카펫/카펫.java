class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = 3; i <= 2005000; i++){
            for(int j = 1; j <= i; j++){
                if(i * j == sum){
                    if((i * 2) + ((j - 2) * 2) == brown){
                        answer[0] = i;
                        answer[1] = j;
                        break;
                    }
                }
            }
            if(answer[0] != 0 && answer[1] != 0){
                break;
            }
        }
        return answer;
    }
}