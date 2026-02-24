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

}
