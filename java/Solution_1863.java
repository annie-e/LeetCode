public class Solution_1863 {
	
	/**
	 * 1863. Sum of All Subset XOR Totals
	 * @param nums
	 * @return XOR sum of all subsets
	 */
	public int subsetXORSum(int[] nums) {
		int sum = 0;
		
		int n = nums.length;
		double subsetCount = Math.pow(2, n);
		
		for(int i = 0; i < subsetCount; i++) {
			int xor = 0;
			for(int j = 0; j < n; j++) {
				if(((i >> j) & 1) == 1) {
					xor ^= nums[j]; 
				}
			}
			sum += xor;
		}
		
		return sum;
    }
}
