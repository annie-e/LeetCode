public class Solution_2769 {
	
	/**
	 * Find the Maximum Achievable Number
	 * @param num
	 * @param t number of operation on num
	 * @return maximum achievable number
	 */
	public int theMaximumAchievableX(int num, int t) {
        if(t == 0) return num;

        return num + (t * 2);
    }
}
