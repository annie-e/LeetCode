public class Solution_1221 {
	
	/**
	 * 1221. Split a String in Balanced Strings
	 * @param s
	 * @return maximum number of balanced substring
	 */
	public int balancedStringSplit(String s) {
        char[] sChar = s.toCharArray();
        int countR = 0;
		int substringCount = 0;

        for(int i = 0; i < sChar.length; i++) {
			if(sChar[i] == 'R') {
				countR++;
			} else {
				countR--;
			}
			
			if(countR == 0) {
				substringCount++;
			}
		}

        return substringCount;
    }
}
