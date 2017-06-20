
/**
 * @author ssm
 *
 */
public class DiameterBinaryTree {
	int diameter(NodeBST node){
	        if(node == null){
	            return 0;
	        }
	        return Integer.max(height(node.left)+height(node.right)+1,Integer.max(diameter(node.left),diameter(node.right)));
	    }
	    
	    int height(NodeBST root){
	        if(root == null){
	            return 0;
	        }
	        return 1+Integer.max(height(root.left),height(root.right));
	    }
}
