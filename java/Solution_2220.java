public class Solution_2220 {
	
	/**
	 * 2220. Minimum Bit Flips to Convert Number
	 * @param start
	 * @param goal
	 * @return minimum bit flip count
	 */
	public int minBitFlips(int start, int goal) {
        int flips = 0;

        while(start > 0 || goal > 0) {
            //compare the least significant bit 
            if ((start & 1) != (goal & 1)) {
                flips++;
            }
            
            // shift bits to the right by 1
            start >>=1;
            goal >>=1;
        }
        return flips;
    }
	
	public int minBitFlipsUsingXor(int start, int goal) {
        int flips = 0;
        
        // XOR gives non matching bits as 1
        int xor = start ^ goal;
		
		while(xor > 0) {
			
			if(1 == (xor & 1)) {
				flips++;
			}
			
			xor >>=1;
		}
        return flips;
    }
}
