
/**
 * @author ssm
 *
 */
public class BinaryTreeHeight {
	int height(NodeBST node) {
	        if(node == null){
	            return 0;
	        }
	        return 1+Integer.max(height(node.left),height(node.right));
	    }
}
