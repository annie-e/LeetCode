import java.util.ArrayList;
import java.util.List;

public class Solution_78 {
	
	/**
	 * 78. Subsets
	 * @param nums
	 * @return list of all possible subsets
	 */
	public List<List<Integer>> subsetsBitManipulation(int[] nums) {
        
        List<List<Integer>> allSubsets = new ArrayList<>();
        int n = nums.length;
        // an element can either be in or out of the subset (2 choices = 2 ^ n)
        double numOfSubsets = Math.pow(2, n);

        for(int i = 0; i < numOfSubsets; i++) {
            List<Integer> subset = new ArrayList<>();
            
            // each bit is a flag that represents in or out (1 = in)
            for(int j = 0; j < n; j++) {
            	// right shift the bit to get the bit to the LSB spot and check if it should be 
            	// in the subset
                if(((i >> j) & 1) == 1) {
                    subset.add(nums[j]);
                }
            }
            allSubsets.add(subset);
        }

        return allSubsets;
    }
}
