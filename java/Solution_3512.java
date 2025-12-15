package acceptance;

public class Solution_3512 {
	
	/**
	 * Minimum Operations to Make Array Sum Divisible by K
	 * @param nums array
	 * @param k divisible number
	 * @return minimum operation
	 */
	
	public int minOperations(int[] nums, int k) {
		
		int sum = 0;
		
		for (int i: nums) {
			sum += i;
		}

        return sum % k;
		
    }
}
