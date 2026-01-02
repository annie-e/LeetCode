public class Solution_1769 {
	
	/**
	 * 1769. Minimum Number of Operations to Move All Balls to Each Box
	 * @param boxes
	 * @return number of operations required to move all balls to index
	 */
	public int[] minOperations(String boxes) {
		int n = boxes.length();
		
		int[] operations = new int[n];			
				
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j == i) continue;
				if(boxes.charAt(j) == '1') {
					operations[i] += Math.abs(i - j);
				}
			}
		}
		
		return operations;
    }
	
	/*
	 * LOGIC:
	 * Adding left side moves and right side moves at a specific index becomes total operations
	 * Since the 'moves' count adds all previous moves, it makes the balls to be one operation 
	 * behind current index, so adding moves + boxes = total operation required
	 * */
	public int[] minOperationsOptimized(String boxes) {
		int n = boxes.length();
		int[] operations = new int[n];			

		int leftBox = 0;
		int leftMoves = 0;
		int rightBox = 0;
		int rightMoves = 0;
		
		// Left
		for(int i = 0; i < n; i++) {
			// as box is one operation behind, it is added with the previous moves
			operations[i] = leftBox + leftMoves;
			leftMoves = operations[i];
			leftBox += Character.getNumericValue(boxes.charAt(i));
		}
		
		// Right
		for(int j = n - 1; j >= 0; j--) {
			operations[j] += rightBox + rightMoves;
			rightMoves = rightBox + rightMoves;
			rightBox += Character.getNumericValue(boxes.charAt(j));
		}
		
		return operations;
	}
}
