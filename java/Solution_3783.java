public class Solution_3783 {
	
	/**
	 * 3783. Mirror Distance of an Integer
	 * @param n
	 * @return mirror distance (n - reverse(n))
	 */
    public int mirrorDistance(int n) {
        
        int ord = n;
        int rev = 0;
		
		while(n > 0) {
			rev = rev * 10 + (n % 10);
			n /= 10;
		}
		
        return Math.abs(ord - rev);
    }
    
    public int mirrorDistanceStringBuilder(int n) {
        
        StringBuilder sb = new StringBuilder();
		sb.append(n);
		
		return Math.abs(n - Integer.parseInt(sb.reverse().toString()));
    }
}
