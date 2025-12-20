public class Solution_2894 {
	
	/**
	 * Divisible and Non-divisible Sums Difference
	 * @param n end number
	 * @param m divisor
	 * @return sum of non divisible - sum of divisible
	 */
	public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int i = 1; i <= n; i++) {
            if((i % m) == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
	
	public int differenceOfSumsTwo(int n, int m) {
		
		// Calculate total Sum 
		int totalSum = n * (n + 1) / 2;
		
		// Get divisible number count 
		int count = n / m;
		
		// Get sum of divisible -> total sequential sum multiplied by the divisor
		int sum = m * (count * (count + 1) / 2);
		
		// totalSum - divisibleSum = non-divisible Sum 
		// non-divisible Sum - divisibleSum -> making it double
		return totalSum - (sum * 2);
	}
}
