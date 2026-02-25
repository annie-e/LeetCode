import java.util.HashMap;
import java.util.Map;

public class Solution_3146 {
	
	/**
	 * 3146. Permutation Difference between Two Strings
	 * @param s
	 * @param t
	 * @return permutation difference
	 */
	public int findPermutationDifference(String s, String t) {
        int permutationDiff = 0;

        for(int i = 0; i < s.length(); i++) {
            int tIndex = t.indexOf(s.charAt(i));
            permutationDiff += Math.abs(tIndex - i);
        }
        
        return permutationDiff;
    }
	
	public int findPermutationDifferenceMap(String s, String t) {
        int permutationDiff = 0;

        Map<Character, Integer> stringIndexMap = new HashMap<>();

        // add the index with corresponding char in map
        for(int i = 0; i < s.length(); i++) {
            stringIndexMap.put(s.charAt(i), i);
        }

        // compare t with s location
        for(int i = 0; i < t.length(); i++) {
            int sIndex = stringIndexMap.get(t.charAt(i));
            permutationDiff += Math.abs(sIndex - i);
        }

        return permutationDiff;
    }
}
