import java.util.Arrays;

public class Solution_3467 {

	/**
	 * 3467. Transform Array by Parity
	 * @param nums
	 * @return sorted odd (1) and even (0)
	 */
	public int[] transformArray(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				nums[i] = 0;
			} else {
				nums[i] = 1;
			}
		}
		
        Arrays.sort(nums);

		return nums;
    }
	
	public int[] transformArrayNoSort(int[] nums) {
        int[] ans = new int[nums.length];
        int even = 0;

        for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
                even++;
            }
		}
		
        for(int i = 0; i < ans.length; i++) {
            if(i < even) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }

        return ans;
    }
}
