import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_1365 {
	
	/**
	 * 1365. How Many Numbers Are Smaller Than the Current Number
	 * Brute Force
	 * @param nums
	 * @return number of smaller numbers than current
	 */
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] smaller = new int[n];
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(i != j && nums[i] > nums[j]) {
					count++;
				}
			}
			smaller[i] = count;
		}
        
        return smaller;
    }
	
	public int[] smallerNumbersThanCurrentUsingMap(int[] nums) {
        int[] copied = Arrays.copyOf(nums, nums.length);
        
        // sort the array and the index will be number of smaller nums
        Arrays.sort(nums);
        
        Map<Integer, Integer> indexMap = new HashMap<>();

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                indexMap.put(nums[i], i);
            }
        }

        for(int j = 0; j < nums.length; j++) {
            copied[j] = indexMap.getOrDefault(copied[j], 0);
        }

        return copied;
    }
}
