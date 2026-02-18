public class Solution_2373 {
	
	/**
	 * 2373. Largest Local Values in a Matrix
	 * @param grid
	 * @return max local matrix
	 */
	public int[][] largestLocal(int[][] grid) {
        int n = grid.length - 2;

		int[][] maxLocal = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				maxLocal[i][j] = findMax(grid, i, j);
			}
		}

        return maxLocal;
    }
	
	/**
	 * Find max number in local grid (3 x 3)
	 * @param grid
	 * @param r
	 * @param c
	 * @return max int
	 */
    public int findMax(int[][] grid, int r, int c) {
		int max = 0;
		
		// max matrix is always 3 x 3, hence + 3
		for(int i = r; i < r + 3; i++) {
			for(int j = c; j < c + 3; j++) {
				max = Math.max(max, grid[i][j]);
			}
		}
		
		return max;
	}
}
