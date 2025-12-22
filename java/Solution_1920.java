public class Solution_1920 {
	
	/**
	 * Build Array from Permutation
	 * @param nums
	 * @return array of nums[nums[i]]
	 */
	public int[] buildArray(int[] nums) {
        
        if(nums.length == 1) return nums;
		
		int[] ans = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			ans[i] = nums[nums[i]];
		}
		
		return ans;
    }
	
	public int[] buildArrayInPlace(int[] nums) {
		
		if(nums.length == 1) return nums;
		
		// remainder is original 
		for(int i = 0; i < nums.length; i++) {
			nums[i] += 1000 * (nums[nums[i]] % 1000);
		}
		
		// quotient is new
		for(int i = 0; i < nums.length; i++) {
			nums[i] /= 1000; 
		}
		
		return nums;
	}
}
