import java.util.ArrayList;
import java.util.List;

public class Solution_1415 {
	
	/**
	 * 1415. The k-th Lexicographical String of All Happy Strings of Length n
	 * @param n
	 * @param k
	 * @return k-th string
	 */
	public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        explore(ans, "", n);
        
        if(ans.size() < k) {
        	return "";
        }
        
        return ans.get(k - 1);
    }
	
    // Backtracking to find all happy strings
	public void explore(List<String> ans, String current, int n) {
		// base case
		if(current.length() == n) {
			ans.add(current);
			return;
		}
		
		for(char c = 'a'; c <= 'c' ; c++) {
			if(current.length() > 0 && current.charAt(current.length() - 1) == c) {
				continue;
			}
			
			explore(ans, current + c, n);
		} 
	}
}
