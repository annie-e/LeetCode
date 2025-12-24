import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution_3668 {
	
	/**
	 * Restore Finishing Order
	 * @param order
	 * @param friends
	 * @return friends in finishing order
	 */
	public int[] recoverOrder(int[] order, int[] friends) {
		
		int[] orderedFriends = new int[friends.length];
		int count = 0;
		
		for(int i = 0; i < order.length; i ++) {
			for(int j = 0; j < friends.length; j++) {
				if (order[i] == friends[j]) {
					orderedFriends[count] = friends[j];
					count++;
					break;
				}
			}
		}
		
		return orderedFriends;
    }
	
	public int[] recoverOrderUsingSet(int[] order, int[] friends) {
		
		// Set<Integer> friendsSet = Arrays.stream(friends).boxed().collect(Collectors.toSet());
		
		Set<Integer> friendsSet = new HashSet<>();

        for(int f: friends) {
            friendsSet.add(f);
        }
		
		int[] orderedFriends = new int[friends.length];
		int count = 0;
		
		for(int o: order) {
			if(friendsSet.contains(o)) {
				orderedFriends[count] = o;
				count++;
			}
		}
		
		return orderedFriends;
	}

}
