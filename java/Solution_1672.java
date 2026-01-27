public class Solution_1672 {
	
	/**
	 * 1672. Richest Customer Wealth
	 * @param accounts
	 * @return maximum wealth
	 */
	public int maximumWealth(int[][] accounts) {
        int wealth = 0;
		
		for(int i = 0; i < accounts.length; i++) {
			int x = 0;
			for(int j = 0; j < accounts[i].length; j++) {
				x += accounts[i][j];
			}
			wealth = Math.max(wealth, x);
		}
		
        return wealth;
    }
}
