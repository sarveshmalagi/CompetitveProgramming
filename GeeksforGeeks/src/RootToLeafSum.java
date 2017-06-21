
/**
 * @author ssm
 *
 */
public class RootToLeafSum {
	boolean hasPathSum(NodeBST node, int sum){
	        if(node == null){
	            return false;
	        }
	        if(node.data == sum && node.left == null && node.right == null){
	            return true;
	        }
	        return hasPathSum(node.left,sum-node.data)||hasPathSum(node.right,sum-node.data);
	    }
}
