import java.util.*;
class Solution {
    public int solution(int[] nums) {

        int N = nums.length/2;
        HashSet<Integer> h1 = new HashSet<Integer>();
        
        for (int num : nums){
            h1.add(num);
        }
        if (h1.size()>N){
            return N;
        } else {
            return h1.size();
        }

    }
}