import java.util.PriorityQueue;

public class Solution_3264 {
	
	/**
	 * 3264. Final Array State After K Multiplication Operations I
	 * @param nums
	 * @param k
	 * @param multiplier
	 * @return array after k multiplication
	 */
	public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0) {
			int lowestIndex = 0;
			for(int i = 1; i < nums.length; i++) {
				lowestIndex = (nums[lowestIndex] > nums[i]) ? i : lowestIndex;
			}
			nums[lowestIndex] *= multiplier;
		}

        return nums;
    }
	
	/**
	 * Using Priority Queue
	 * @param nums
	 * @param k
	 * @param multiplier
	 * @return
	 */
	public int[] getFinalStatePriorityQueue(int[] nums, int k, int multiplier) {

        // priority queue created with smallest number 
        // if more than one smallest number, compare index
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
            int compareValue = Integer.compare(a[0], b[0]);
            if(compareValue == 0) return Integer.compare(a[1], b[1]);
            return compareValue;
        });

        // insert all the nums into heap (val, index)
        // will be in priority set above
        for(int i = 0; i < nums.length; i++) {
            heap.offer(new int[] {nums[i], i});
        }
        
        // smallest value is at head, so remove and get the value
        while(k-- > 0) {
            int[] smallest = heap.poll();
            int index = smallest[1];

            nums[index] *= multiplier;
            
            // insert it back into queue
            heap.offer(new int[] {nums[index], index});
        }

        return nums;
    }
}


