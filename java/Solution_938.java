public class Solution_938 {
	
	
	/**
	 * 938. Range Sum of BST
	 * @param root
	 * @param low
	 * @param high
	 * @return sum of range between low and high
	 */
	public int rangeSumBST(TreeNode root, int low, int high) {
	    
	    if(root == null) return 0;
	
	    // left
	    int leftSum = rangeSumBST(root.left, low, high);
	
	    // right
	    int rightSum = rangeSumBST(root.right, low, high);
	
	    // current node value
	    int current = (root.val >= low && root.val <= high)? root.val : 0;
	
	    return current + leftSum + rightSum;
	    
	}

    // Efficient way as it only checks the nodes of the tree that is in range
	public int rangeSumBSTEfficient(TreeNode root, int low, int high) {
	    
	    if(root == null) return 0;
	
	    if (root.val >= low && root.val <= high) {
	    	return root.val
	    			+ rangeSumBSTEfficient(root.left, low, high)
	    			+ rangeSumBSTEfficient(root.right, low, high);
	    } else if (root.val < low) {
	    	return rangeSumBSTEfficient(root.right, low, high);
	    } else {
	    	return rangeSumBSTEfficient(root.left, low, high);
	    }
	    
	}
}
