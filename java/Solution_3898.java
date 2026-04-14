public class Solution_3898 {
	
	/**
	 * 3898. Find the Degree of Each Vertex
	 * @param matrix
	 * @return degrees
	 */
	public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
		int[] ans = new int[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				ans[i] += matrix[i][j];
			}
		}
		
		return ans;
    }
	
}
