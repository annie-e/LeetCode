public class Solution_2125 {
	
	/**
	 * 2125. Number of Laser Beams in a Bank
	 * @param bank
	 * @return number of beams
	 */
	public int numberOfBeams(String[] bank) {
		int beams = 0;
		int prevSecurity = 0;

        // collect all the security devices and add their product
		for(int i = 0; i < bank.length; i++) {
			int currentSecurity = 0;

            for(char c: bank[i].toCharArray()) {
                if(c == '1') {
                    currentSecurity++;
                }
            }

            if(currentSecurity > 0) {
                beams += currentSecurity * prevSecurity;
                prevSecurity = currentSecurity;
            }
            
		}
		
        return beams;
    }
	
	public int numberOfBeamsLongSolution(String[] bank) {
        int[] security = new int[bank.length];
		int beams = 0;
		
		for(int i = 0; i < bank.length; i++) {
			security[i] = (int) bank[i].chars().filter(c -> c == '1').count();
		}
		
		int left = 0; 
		int right  = 0 + 1;
		
		while(left < security.length && right < security.length) {
			if(security[left] > 0) {
				if(security[right] > 0) {
					beams += security[left] * security[right];
					left = right; 
					right++;
				} else {
					right++;
				}
				
			} else {
				left++;
				right++;
			}
		}

        return beams;
    }
}
