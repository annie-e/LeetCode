public class Solution_3498 {
	
	/**
	 * 3498. Reverse Degree of a String
	 * @param s
	 * @return reverse degree (1- indexed * reversed alphabet)
	 */
	public int reverseDegree(String s) {
        char[] sArray = s.toCharArray();
		int reverseDegree = 0;
		
		for(int i = 0; i < sArray.length; i++) {
			reverseDegree += ((i + 1) * Math.abs(sArray[i] - 123));
		}

        return reverseDegree;
    }
}
