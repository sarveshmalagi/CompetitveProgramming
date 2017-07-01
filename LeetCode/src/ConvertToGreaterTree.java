
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/convert-bst-to-greater-tree/
public class ConvertToGreaterTree {
	int sum = 0;
	    public TreeNode convertBST(TreeNode root) {
	        convertBSTUtil(root);
	        return root;
	    }
	    
	    public void convertBSTUtil(TreeNode root){
	        if(root == null)
	            return;
	        convertBSTUtil(root.right);
	        root.val += sum;
	        sum = root.val;
	        convertBSTUtil(root.left);
	    }
}
