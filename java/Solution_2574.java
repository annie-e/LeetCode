public class Solution_2574 {
	
	/**
	 * 2574. Left and Right Sum Differences
	 * @param nums
	 * @return left and right sum differences
	 */
	public int[] leftRightDifference(int[] nums) {
       
		int length = nums.length;
		
		if(length == 1) return new int[]{0};
		
		int[] leftNums = new int[length];
		int[] rightNums = new int[length];
		
		int leftSum = 0;
		int rightSum = 0;
		
		for(int i = 0; i < length; i++) {
			leftNums[i] = leftSum;
			leftSum += nums[i];
		}
		
		for(int j = length - 1; j >= 0; j--) {
			rightNums[j] = rightSum;
			rightSum += nums[j];
		}
		
		for(int i = 0; i < length; i++) {
			nums[i] = Math.abs(leftNums[i] - rightNums[i]);
		}

		return nums;
    }
}
