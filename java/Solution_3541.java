import java.util.HashMap;
import java.util.Map;

public class Solution_3541 {
	
	/**
	 * 3541. Find Most Frequent Vowel and Consonant
	 * @param s
	 * @return sum of max vowel repeats and max consonant repeats
	 */
	public int maxFreqSum(String s) {
		int vowelMaxFreq = 0;
		int consonantMaxFreq = 0;
		
		Map<Character, Integer> maxFreq = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++) {
			maxFreq.put(s.charAt(i), maxFreq.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for(Character c: maxFreq.keySet()) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelMaxFreq = Math.max(vowelMaxFreq, maxFreq.get(c));
			} else {
				consonantMaxFreq = Math.max(consonantMaxFreq, maxFreq.get(c));
			}
		}
		
		return vowelMaxFreq + consonantMaxFreq;
    }
}
