public class Solution_3280 {
	
	/**
	 * 3280. Convert Date to Binary
	 * @param date
	 * @return binary date string
	 */
	public String convertDateToBinary(String date) {
		String yy = intToBinary(Integer.valueOf(date.substring(0, 4)));
		String mm = intToBinary(Integer.valueOf(date.substring(5, 7)));
		String dd = intToBinary(Integer.valueOf(date.substring(8)));
		
		return yy + "-" + mm + "-" + dd;
    }
	
	private String intToBinary(int num) {
		
		if(num == 0) return "0";
		
		StringBuilder binary = new StringBuilder();
		
		while(num > 0) {
			binary.append(num % 2);
			num /= 2;
		}
		
		return binary.reverse().toString();
	}
	
	public String convertDateToBinaryStringBuilder(String date) {
        String[] dateArray = date.split("-");

        StringBuilder dateBuilder = new StringBuilder();

        for(String s: dateArray) {
            dateBuilder.append(Integer.toBinaryString(Integer.parseInt(s)));
            dateBuilder.append("-");
        }

        dateBuilder.deleteCharAt(dateBuilder.length() - 1);
        return dateBuilder.toString();
    }
	
}
