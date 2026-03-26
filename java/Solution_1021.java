public class Solution_1021 {
	
	/**
	 * 1021. Remove Outermost Parentheses
	 * @param s
	 * @return primitive string with outermost parenteses removed
	 */
	 public String removeOuterParentheses(String s) {
        String ans = "";
        char[] sChar = s.toCharArray();

        int left = 0; 
        int right = 0; 
    	int start = 0; 

        for(int i = 0; i < sChar.length; i++) {
        	
            if(sChar[i] == '(') {
            	right++;
            } else {
            	left++;
            }
            if(left == right) {
            	String primitive = s.substring(start + 1, i);
            	start = i + 1;
            	ans += primitive;
            }
        }

        return ans;
    }
	
	 
	public String removeOuterParenthesesSB(String s) {
        StringBuilder res = new StringBuilder();
        
        int count = 0;

        for(char c: s.toCharArray()) {
            if(c == '(') {
            	// append first to ignore first '('
                if(count > 0) {
                    res.append(c);
                }
                count++;
            } else {
            	// remove count first to ignore last ')'
                count--;
                if(count > 0) {
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
}
