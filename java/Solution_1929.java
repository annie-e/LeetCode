public class Solution_1929 {
	
	/**
	 * 1929. Concatenation of Array
	 * @param nums
	 * @return concatenation array
	 */
	public int[] getConcatenation(int[] nums) {
        int n = nums.length;
		int[] ans = new int[n * 2];
		
		for(int i = 0; i < n; i++) {
			ans[i] = nums[i];
            ans[i + n] = nums[i];
		}

        return ans;
    }
	
	public int[] getConcatenationSecond(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n * 2];
		
		for(int i = 0; i < ans.length; i++) {
			ans[i] = (i <= (n - 1))? nums[i] : nums[i - n];
		}

        return ans;
	    
	}
}
