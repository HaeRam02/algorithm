import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringTokenizer toknizer = new StringTokenizer(s);
        int min = Integer.parseInt(toknizer.nextToken());
        int max = min;
        
        while(toknizer.hasMoreTokens()){
            int num = Integer.parseInt(toknizer.nextToken());
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        answer = min + " " + max;
        return answer;
    }
}