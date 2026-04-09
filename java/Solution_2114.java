public class Solution_2114 {
	
	/**
	 * 2114. Maximum Number of Words Found in Sentences
	 * @param sentences
	 * @return most number of words in setences
	 */
	public int mostWordsFound(String[] sentences) {
        
		int ans = 0;
        
		for(String sentence: sentences) {
			String[] split = sentence.split(" ");
			int words = split.length; 
			
			ans = Math.max(ans, words);
		}
		
		return ans;
    }
}
