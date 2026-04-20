import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_1282 {
	
	/**
	 * 1282. Group the People Given the Group Size They Belong To
	 * 
	 * @param groupSizes
	 * @return groups of people
	 */
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
		
		Map<Integer, List<Integer>> groupMap = new HashMap<>();
		
		for(int i = 0; i < groupSizes.length; i++) {
			if(!groupMap.containsKey(groupSizes[i])) {
				groupMap.put(groupSizes[i], new ArrayList<>());
			}
			
            groupMap.get(groupSizes[i]).add(i);

			if(groupMap.get(groupSizes[i]).size() == groupSizes[i]) {
				ans.add(groupMap.get(groupSizes[i]));
				groupMap.remove(groupSizes[i]);
			}
		}

        return ans;
    }
}
