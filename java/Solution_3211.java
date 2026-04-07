import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_3211 {
	
	/**
	 * 3211. Generate Binary Strings Without Adjacent Zeros
     * Backtracking
	 * @param n
	 * @return validStrings (no adjacent 0s)
	 */
    public List<String> validStrings(int n) {  
        List<String> validStrings = new ArrayList<>();
        explore(n, "", validStrings);
        
        return validStrings;
    }

    public void explore(int n, String current, List<String> ans) {
		
		if(current.length() == n) {
			ans.add(current);
            return;
		}
		
        // if ending in 0, do not explore options with adjacent 0, just 1
		if(current.length() == 0 || current.charAt(current.length() - 1) == '1') {
            explore(n, current + "0", ans);
        }
        explore(n, current + "1", ans);
	}
	
	
	// Explore ALL possibilities first
	public List<String> validStringsLong(int n) {
        if(n == 1) {
        	return Arrays.asList("0", "1");
        }
        
        List<String> validStrings = new ArrayList<>();
        exploreLong(n, "", validStrings);
        
        return validStrings;
    }
	
	public void exploreLong(int n, String current, List<String> ans) {
		
		if(current.length() == n) {
			if(!current.contains("00")) {
				ans.add(current);
			}
			return;
		}
		
		// i can be 0 or 1
		for(int i = 0; i < 2; i++) {
			exploreLong(n, current + i, ans);
		}
		
	}
}
