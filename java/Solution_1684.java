import java.util.HashSet;
import java.util.Set;

public class Solution_1684 {
	
	public int countConsistentStrings(String allowed, String[] words) {
		int consistentStringCount = 0;
				
		Set<Character> allowedSet = new HashSet<>();
		for(char c: allowed.toCharArray()) {
			allowedSet.add(c);
		}
		
		for(String word: words) {
			boolean isConsistent = true;
			for(char c: word.toCharArray()) {
				if(!allowedSet.contains(c)) {
					isConsistent = false;
					break;
				}
			}
			
			if(isConsistent) {
				consistentStringCount++;
			}
		}
		
		return consistentStringCount;
    }
	
}
