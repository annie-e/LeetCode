import java.util.ArrayList;
import java.util.List;

public class Solution_1389 {
	
	/**
	 * 1389. Create Target Array in the Given Order
	 * @param nums
	 * @param index
	 * @return array in given index order
	 */
	public int[] createTargetArray(int[] nums, int[] index) {
        
       int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
        	// manually shift the positions
            for(int j = i; j > index[i]; j--) {
                ans[j] = ans[j - 1];
            }
            
        ans[index[i]] = nums[i];
       }

        return ans;
    }
	
	public int[] createTargetArrayWithList(int[] nums, int[] index) {
        
        List<Integer> ansList = new ArrayList<>();
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ansList.add(index[i], nums[i]);
        }

        for(int j = 0; j < ansList.size(); j++) {
            ans[j] = ansList.get(j);
        }

        return ans;
    }
}
