import java.util.TreeSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        TreeSet<Integer> set = new TreeSet();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        if(set.size() < nums.length / 2){
            answer = set.size();
        } else {
            answer = nums.length / 2;
        }
        
        return answer;
    }
}