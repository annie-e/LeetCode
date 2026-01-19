public class Solution_3794 {
	
	/**
	 * 3794. Reverse String Prefix - Two Pointer Solution
	 * @param s
	 * @param k number of prefix
	 * @return reversed string
	 */
	public String reversePrefix(String s, int k) {
        
        if(s.length() == 1) return s;

		int first = 0; 
        int second = k - 1;

        char[] c = s.toCharArray();

        while(first < second) {
            char temp = c[first];
            c[first] = c[second];
            c[second] = temp;
            
            first++;
            second--;
        }

        return new String(c);
    }
	
	
	public String reversePrefixStringBuilder(String s, int k) {
        
		if(s.length() == 1) return s;

		StringBuilder reversed = new StringBuilder(s.substring(0, k));
		reversed.reverse();
		reversed.append(s.substring(k));

        return reversed.toString();
	}
}
