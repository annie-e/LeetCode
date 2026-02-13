public class Solution_2798 {
	
	/**
	 * 2798. Number of Employees Who Met the Target
	 * @param hours
	 * @param target
	 * @return
	 */
	public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
	        
		int empTarget = 0;

		for(int hour: hours) {
		    if(hour >= target) {
		        empTarget++;
		    }
		}
		
		return empTarget;
	}
}
