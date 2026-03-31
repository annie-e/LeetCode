public class Solution_1816 {
	
	/**
	 * 1816. Truncate Sentence
	 * @param s
	 * @param k
	 * @return
	 */
	public String truncateSentence(String s, int k) {
        String[] sArray = s.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < k; i++) {
			sb.append(sArray[i] + " ");
		}

        return sb.toString().trim();
    }
}
