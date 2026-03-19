import java.util.Arrays;
import java.util.Comparator;

public class Solution_1367 {
	
	/**
	 * 1637. Widest Vertical Area Between Two Points Containing No Points
	 * @param points
	 * @return widest vertical area
	 */
	public int maxWidthOfVerticalArea(int[][] points) {
        int widestVerticalArea = 0;
		
		Arrays.sort(points, Comparator.comparingInt(p -> p[0]));

        for(int i = 0; i < points.length - 1; i++) {
            widestVerticalArea = Math.max(widestVerticalArea, points[i + 1][0] - points[i][0]);
        }

        return widestVerticalArea;
    }
	
	public int maxWidthOfVerticalAreaFastRunTime(int[][] points) {
		int widestVerticalArea = 0;
		
		int[] sorted = new int[points.length];
		for(int i = 0; i < points.length; i++) {
            sorted[i] = points[i][0];
        }

        Arrays.sort(sorted);

        for(int i = 0; i < sorted.length - 1; i++) {
        	widestVerticalArea =  Math.max(widestVerticalArea, (sorted[i + 1] - sorted[i]));
        }

        return widestVerticalArea;
    }
}
