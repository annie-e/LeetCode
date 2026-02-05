public class Solution_1678 {
	
	/**
	 * 1678. Goal Parser Interpretation
	 * @param command
	 * @return goal parsed string
	 */
	public String interpret(String command) {
        char[] commandArr = command.toCharArray();
        int len = commandArr.length;
		StringBuilder goalParsed = new StringBuilder(len);
		
		for(int i = 0; i < len; i++) {
			if(commandArr[i] == 'G') {
				goalParsed.append("G");
			} else if(commandArr[i] == '(' && commandArr[i + 1] == ')') {
				goalParsed.append("o");
			} else if(commandArr[i] == '(' && commandArr[i + 1] == 'a') {
				goalParsed.append("al");
				i += 3;
			}
		}
		return goalParsed.toString();
    }
}
