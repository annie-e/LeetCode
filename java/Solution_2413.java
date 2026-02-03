public class Solution_2413 {
	
	/**
	 * 2413. Smallest Even Multiple
	 * @param n
	 * @return multiple of both n & 2
	 */
	public int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }
}
