
/**
 * @author ssm
 *
 */
public class AddOneRowTree {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
	        if(root == null)
	            return root;
	            
	        if(d == 1){
	            TreeNode newRoot = new TreeNode(v);
	            newRoot.left = root;
	            return newRoot;
	        }
	        
	        if(d == 2){
	            TreeNode tempLeft = root.left;
	            TreeNode newLeft = new TreeNode(v);
	            root.left = newLeft;
	            newLeft.left = tempLeft;   

	            TreeNode tempRight = root.right;
	            TreeNode newRight = new TreeNode(v);
	            root.right = newRight;
	            newRight.right = tempRight;
	            return root;
	        }
	        
	        root.left = addOneRow(root.left,v,d-1);
	        root.right = addOneRow(root.right,v,d-1);
	        
	        return root;
	    }
}
