
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/balanced-binary-tree/
public class IsBalanced {
	public class Solution {
	    boolean balanced = true;
	    public boolean isBalanced(TreeNode root) {
	        return (BalancedUtil(root) != -1);	//check root
	    }
	    
	    int BalancedUtil(TreeNode root){
	        if(root == null)
	            return 0;	//base case
	        int left = BalancedUtil(root.left);
	        if(left == -1)
	            return -1;
	        int right = BalancedUtil(root.right);
	        if(right == -1)
	            return -1;
	        if(Math.abs(left-right) > 1)	//if unbalanced, propagate the change upwards
	            return -1;
	        return Integer.max(left,right)+1;
	    }
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}