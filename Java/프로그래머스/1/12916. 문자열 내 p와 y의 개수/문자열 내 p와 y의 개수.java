class Solution {
    boolean solution(String s) {
        int pNum = (int) s.toLowerCase().chars().filter(c -> c == 'p').count();
        int yNum = (int) s.toLowerCase().chars().filter(c -> c == 'y').count();
        
        if (pNum == yNum || pNum == 0 && yNum == 0){
            return true;
        }else {
            return false;
        }
    }
}