public class Solution_1720 {
	
	/**
	 * 1720. Decode XORed Array
	 * 
	 * @param encoded
	 * @param first
	 * @return decoded array
	 */
	public int[] decode(int[] encoded, int first) {
		
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        
        for(int i = 0; i < encoded.length; i++) {
        	// flip switches back to get original number
        	ans[i + 1] = ans[i] ^ encoded[i];
        }
        
        return ans;
    }
}
