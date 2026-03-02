public class Solution_1689 {
	
	/**
	 * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
	 * 
	 * Greatest number (character) in the String is the answer 
	 * as it needs minimum of the max number of 1s to create the total
	 * 
	 * @param n
	 * @return minumum number of deci-binary number
	 */
	public int minPartitions(String n) {
        int minNumber = 0;

        for(char c: n.toCharArray()) {
            minNumber = Math.max(minNumber, c - '0');
        }

        return minNumber;
    }
}
