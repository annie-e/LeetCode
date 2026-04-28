import java.util.HashSet;
import java.util.Set;

public class Solution_2657 {
	/**
	 * 2657. Find the Prefix Common Array of Two Arrays
	 * 
	 * @param A
	 * @param B
	 * @return prefix common array
	 */
	public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[B.length];
		
		Set<Integer> prefix = new HashSet<>();
		
		int prefixCount = 0;
		
		for(int i = 0; i < A.length; i++) {
			if(prefix.contains(A[i])) {
				prefixCount++;
				prefix.remove(A[i]);
			} else {
				prefix.add(A[i]);
			}
			
			if(prefix.contains(B[i])) {
				prefixCount++;
				prefix.remove(B[i]);
			} else {
				prefix.add(B[i]);
			}
			
			C[i] = prefixCount;
		}

        return C;
    }
}
