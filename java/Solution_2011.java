public class Solution_2011 {
	
	/**
	 * 2011. Final Value of Variable After Performing Operations
	 * @param operations
	 * @return result after all operations
	 */
	public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].contains("-")) {
                x--;
            } else {
                x++;
            }
        }
        return x;
    }
}
