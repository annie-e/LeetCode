import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_3289 {
	
	/**
	 * 3289. The Two Sneaky Numbers of Digitville
	 * @param nums digitville
	 * @return sneaky numbers that are repeated
	 */
	 public int[] getSneakyNumbers(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
		List<Integer> sneakyNum = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
			
			if(numsMap.get(nums[i]) == 2) {
				sneakyNum.add(nums[i]);
			}
		}

        return sneakyNum.stream().mapToInt(Integer::intValue).toArray();
    }
	 
	 public int[] getSneakyNumbersExact(int[] nums) {
	 	// there are exactly 2 sneaky numbers
        int[] sneakyNum = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
		int count = 0;

		for(int i = 0; i < nums.length; i++) {
			numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
			
			if(numsMap.get(nums[i]) == 2) {
				sneakyNum[count++] = nums[i];
			}
		}

        return sneakyNum;
	}
}
