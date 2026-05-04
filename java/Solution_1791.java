public class Solution_1791 {
	
	/**
	 * 1791. Find Center of Star Graph
	 * @param edges
	 * @return center of the start graph
	 */
	public int findCenter(int[][] edges) {
        return (edges[0][0] == edges[1][0]) ?
        		edges[1][0] : (edges[0][0] == edges[1][1]) ? edges[1][1] : edges[0][1];
    }
}
