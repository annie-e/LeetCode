public class Solution_1281 {
	
	/**
	 * 1281. Subtract the Product and Sum of Digits of an Integer
	 * @param n
	 * @return produce minus sum
	 */
	public int subtractProductAndSum(int n) {
        String nString = String.valueOf(n);
		
		int product = 1;
		int sum = 0;
		
		for(char i: nString.toCharArray()) {
			int a = i - '0';
			product *= a;
			sum += a;
		}
		
        return product - sum;
    }
}
