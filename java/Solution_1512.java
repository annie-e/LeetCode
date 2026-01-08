public class Solution_1512 {
	
	/**
	 * 1512. Number of Good Pairs
	 * @param nums
	 * @return number of good pairs (nums[i] == nums[j] && i < j)
	 */
	public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        for(int i = 0; i < nums.length; i++) {
        for(int j = i + 1; j < nums.length; j++) {
            if(nums[i] == nums[j]) {
                goodPairs++;
            }
        }
       }

       return goodPairs;
    }
	
	public int numIdenticalPairsOnePass(int[] nums) {
		int goodPairs = 0;
		// only with restriction nums.length <= 100
		// if greater, can use HashMap to store (num, count)
		int[] count = new int[101];
		
		for(Integer n: nums) {
			// goodPairs is the number already paired before passing 
			// count is the count of the same number that has already been passed that needs to be paired with
			// thus, goodPairs += count is total number of good pairs thus far 
			// count[n]++ is counting the current number into consideration
			// since the for loop only looks 'back', i will always be less than j
			goodPairs += count[n]++;
		}
		
		return goodPairs;
	}
	
}
