import java.util.ArrayList;
import java.util.List;

public class Solution_3285 {
	
	/**
	 * 3285. Find Indices of Stable Mountains
	 * 
	 * @param height
	 * @param threshold
	 * @return indices of stable mountains
	 */
	public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stableMountains = new ArrayList<>();
		
		for(int i = 1; i < height.length; i++) {
			if(height[i-1] > threshold) {
				stableMountains.add(i);
			}
		}

        return stableMountains;
    }
}
