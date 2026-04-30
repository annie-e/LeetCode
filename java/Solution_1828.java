public class Solution_1828 {
	
	/**
	 * 1828. Queries on Number of Points Inside a Circle
	 * 
	 * @param points
	 * @param queries
	 * @return number of points included in the circle
	 */
	public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
		
		for(int i = 0; i < queries.length; i++) {
			int included = 0;
            int qx = queries[i][0];
            int qy = queries[i][1];
            int rad = queries[i][2];

			for(int[] p: points) {
				int dx = qx - p[0];
                int dy = qy - p[1];
                
                // euclidean distance has to be shorter than the radius of the circle
				if(((dx * dx) + (dy * dy)) <= (rad * rad)) {
					included++;
				}	
			}
			ans[i] = included;
		}
        return ans;

    }
}
