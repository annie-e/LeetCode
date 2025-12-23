public class Solution_3190 {
	
	/**
	 * Find Minimum Operations to Make All Elements Divisible by Three
	 * @param nums array of elements
	 * @return minimum count of operations
	 */
	public int minimumOperations(int[] nums) {
        
		int minOperation = 0;
		
		for(int i = 0; i < nums.length; i++) {
			int mod = nums[i] % 3;
					
			if(mod == 0) {
				continue;
			}
			
			// there can only be 3 remainders (0, 1, 2)
			// 1 and 2 both requires one operation each
			minOperation++;
		}
		
		return minOperation;
    }
}
