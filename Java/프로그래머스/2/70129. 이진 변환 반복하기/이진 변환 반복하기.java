import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;
        
        if(s.equals("1")){
            answer[0] = cnt;
            answer[1] = zeroCnt;
            return answer;
        }
        
        if(s.replace("0","").equals("1")){
            cnt = 1;
            zeroCnt = s.length() - s.replace("0","").length();
            answer[0] = cnt;
            answer[1] = zeroCnt;
            return answer;
        }
        
        while(!s.equals("1")){
            if(s.contains("0")){
                cnt++;
                zeroCnt += s.length() - s.replace("0","").length();
            } else {
                cnt++;
            }
            s = makeInt(s.replace("0","").length());
        }
        answer[0] = cnt;
        answer[1] = zeroCnt;
        return answer;
    }
    
    private String makeInt(int s){
        StringBuilder sb = new StringBuilder();
        
        while(s != 0){
            sb.append(s%2);
            s = s/2;
        }
        sb.reverse();
        return sb.toString();
    }
}