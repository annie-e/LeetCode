public class Solution_3516 {
	public int findClosest(int x, int y, int z) {
		
		int xDistance = Math.abs(x - z);
		int yDistance = Math.abs(y - z);
		
		if(xDistance == yDistance) {
			return 0;
		} else if (xDistance > yDistance){
			return 2;
		} else {
			return 1;
		}
    }
}
