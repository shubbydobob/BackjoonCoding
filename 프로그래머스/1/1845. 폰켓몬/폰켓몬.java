import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> uniquePokemon = new HashSet<>();
        for (int num : nums) {
            uniquePokemon.add(num);
        }
        
        int maxSelection = nums.length / 2;
        
        return Math.min(uniquePokemon.size(), maxSelection);
    }

}