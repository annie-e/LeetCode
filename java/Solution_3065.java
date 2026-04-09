public class Solution_3065 {
	
	/**
	 * 3065. Minimum Operations to Exceed Threshold Value I
	 * @param nums
	 * @param k
	 * @return minimum number of operations required to remove numbers < k
	 */
	public int minOperations(int[] nums, int k) {
        int ans = 0;
        
		for(int num: nums) {
			if(num < k) {
				ans++;
			}
		}
		
		return ans;
    }
}
