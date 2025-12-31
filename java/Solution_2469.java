public class Solution_2469 {
	
	/**
	 * 2469. Convert the Temperature
	 * @param celsius
	 * @return kelvin, fahrenheit
	 */
	public double[] convertTemperature(double celsius) {
		
		double kelvin = celsius + 273.15;
		double fahrenheit = celsius * 1.80 + 32.00;
		
		return new double[] {kelvin, fahrenheit};
    }
}
