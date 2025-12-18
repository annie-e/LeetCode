import java.util.HashSet;
import java.util.Set;

public class Solution_3760 {
	
	/**
	 * Maximum Substrings With Distinct Start
	 * @param s
	 * @return number of distinct character
	 */
	public int maxDistinct(String s) {
        Set<Character> set = new HashSet<>();

        for(Character c: s.toCharArray()) {
            set.add(c);
        }

        return set.size();
    }
}
