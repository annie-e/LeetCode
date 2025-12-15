public class Solution_3110 {
	/**
	 * Score of a String
	 * @param s
	 * @return score of the string s
	 */
	public int scoreOfString(String s) {
        int sumOfDiff = 0;
		
		for(int i = 0; i < s.length() - 1; i++) {
			sumOfDiff += Math.abs((s.charAt(i) - s.charAt(i + 1)));
		}
		
		return sumOfDiff;
    }
}