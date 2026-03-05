public class Solution_1486 {
	
	/**
	 * 1486. XOR Operation in an Array
	 * @param n
	 * @param start
	 * @return xor for array of (start + 2 * i)
	 */
	public int xorOperation(int n, int start) {
        int xor = 0;

        for(int i = 0; i < n; i++) {
            int num = start + 2 * i;
            xor ^= num;
        }

        return xor;
    }
}
