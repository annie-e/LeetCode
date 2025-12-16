public class Solution_2807 {
	
	/**
	 * Insert Greatest Common Divisors in Linked List
	 * @param head
	 * @return list of nodes with gcd in between
	 */
	public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode nodeOne = head;
        ListNode nodeTwo = head.next;

        while(nodeTwo != null) {

			int a = Math.abs(nodeOne.val);
			int b = Math.abs(nodeTwo.val);
			
			while(b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
			
            int gcd = a;
        
			ListNode newNode = new ListNode(gcd, nodeOne.next);
			nodeOne.next = newNode;

            nodeOne = newNode.next;
            nodeTwo = nodeTwo.next;

		}
		
		return head;
    }
}
