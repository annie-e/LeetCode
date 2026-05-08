public class Solution_3895 {
	
	/**
	 * 3895. Count Digit Appearances
	 * @param nums
	 * @param digit
	 * @return number of times digit appeared
	 */
	public int countDigitOccurrences(int[] nums, int digit) {
        
        int ans = 0; 

        for(int num: nums) {
            while(num > 0) {
                if ((num % 10) == digit) {
                    ans++;
                }
                num /= 10;
            }
         }

        return ans;
    }
	
	public int countDigitOccurrencesCharSolution(int[] nums, int digit) {
        
        int ans = 0; 

        for(int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            for(char c: s.toCharArray()) {
                if((c - '0') == digit) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
