import java.util.HashSet;
import java.util.Set;

public class Solution_771 {
	
	/**
	 * 771. Jewels and Stones
	 * @param jewels
	 * @param stones
	 * @return number of jewels in stones
	 */
	public int numJewelsInStones(String jewels, String stones) {
		int numOfJewels = 0;
		
		Set<Character> jewelMap = new HashSet<>();
		
		for(Character jewel: jewels.toCharArray()) {
			jewelMap.add(jewel);
		}
		
		for(Character stone: stones.toCharArray()) {
			if(jewelMap.contains(stone)) {
				numOfJewels++;
			}
		}
		
		return numOfJewels;
    }
}
