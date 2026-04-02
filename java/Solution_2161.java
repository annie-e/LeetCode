import java.util.ArrayList;
import java.util.List;

public class Solution_2161 {
	
	public int[] pivotArray(int[] nums, int pivot) {
		int[] ans = new int[nums.length];
		List<Integer> less = new ArrayList<>();
		List<Integer> great = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < pivot) {
				less.add(nums[i]);
			}
			
			if(nums[i] == pivot) {
				equal.add(nums[i]);
			}
			
			if(nums[i] > pivot) {
				great.add(nums[i]);
			}
		}
		
		less.addAll(equal);
		less.addAll(great);
		
		for(int i = 0; i < ans.length; i++) {
			ans[i] = less.get(i);
		}
		
		return ans;
	}
	
	public int[] pivotArrayTwoPointer(int[] nums, int pivot) {
		
        int[] ans = new int[nums.length];
        int less = 0;
        int great = nums.length - 1;
        
        for(int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
        	
        	// fill with num less than pivot in order of array
        	if(nums[i] < pivot) {
        		ans[less] = nums[i];
        		less++;
        	}
        	
        	// fill num greater than pivot from very end 
        	if(nums[j] > pivot) {
        		ans[great] = nums[j];
        		great--;
        	}
        }
        
        // in between less and great is pivot
        while(less <= great) {
        	ans[less] = pivot;
        	less++;
        }
        
        return ans;
    }
}
