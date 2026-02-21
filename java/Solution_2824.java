import java.util.List;

public class Solution_2824 {
	
	/**
	 * 2824. Count Pairs Whose Sum is Less than Target
	 * @param nums
	 * @param target
	 * @return count of sum of pairs less than target
	 */
	public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if((nums.get(i) + nums.get(j)) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
