import java.util.ArrayList;
import java.util.List;

public class Solution_2044 {
	
	/**
	 * 2044. Count Number of Maximum Bitwise-OR Subsets
	 * 
	 * @param nums
	 * @return number of subsets that match max OR
	 */
	public int countMaxOrSubsets(int[] nums) {
        int max = 0;

        // max of OR is always all num OR in array 
        for(int num: nums) {
            max |= num;
        } 

		return explore(nums, 0, 0, max);
    }

    public int explore(int[] nums, int current, int index, int max) {
		
        if(index == nums.length) {
            return (current == max) ? 1 : 0;
        }

        // To include current index from bit OR operation
        int included = explore(nums, current | nums[index], index + 1, max);

        // To exclude current index from bit OR operation
        int excluded = explore(nums, current, index + 1, max);
        
        // add parent results
        return included + excluded;
	}
    
	
	public int countMaxOrSubsetsWithListedArrays(int[] nums) {
		int ans = 0;
        int max = 0;

        for(int num: nums) {
            max |= num;
        } 

		List<List<Integer>> subsets = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		
		explore(subsets, current, nums, 0);
		
		for(int i = 0; i < subsets.size(); i++) {
            int subsetOr = 0;

			for(int j = 0; j < subsets.get(i).size(); j++) {
				subsetOr |= subsets.get(i).get(j);
			}

            if(subsetOr == max) {
                ans++;
            }
		}
		
		return ans;
    }
	
	public void exploreList(List<List<Integer>> subsets, List<Integer> current, int[] nums, int start) {
		
		subsets.add(new ArrayList<>(current));
		
		for(int i = start; i < nums.length; i++) {
			
			current.add(nums[i]);
			
			exploreList(subsets, current, nums, i + 1);
			
			current.remove(current.size() - 1);
		}

	}
}
