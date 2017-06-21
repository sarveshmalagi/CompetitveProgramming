
/**
 * @author ssm
 *
 */
public class BalancedCHeck {
	boolean isBalanced(NodeBST root){
	        return isBalancedUtil(root)!=-1;
	    }
	    
	    int isBalancedUtil(NodeBST root){
	        if(root == null){
	            return 0;
	        }
	        int leftHeight = isBalancedUtil(root.left);
	        int rightHeight = isBalancedUtil(root.right);
	        if(leftHeight != -1 && rightHeight != -1){
	            int bf = leftHeight - rightHeight;
	            if(bf >= -1 && bf <= 1){
	                return Integer.max(leftHeight,rightHeight)+1;
	            }   
	        }
	        return -1;
	    }
}
