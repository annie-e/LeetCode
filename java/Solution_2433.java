public class Solution_2433 {
	
	/**
	 * 2433. Find The Original Array of Prefix Xor
	 * @param pref
	 * @return prefix for XOR
	 */
	public int[] findArray(int[] pref) {
		int n = pref.length;
        int[] ans = new int[n];
        
        ans[0] = pref[0];
        
        for(int i = 1; i < n; i++) {
        	// self-inverse property of XOR
        	ans[i] = pref[i - 1] ^ pref[i];
        }
        
        return ans;
    }
}
