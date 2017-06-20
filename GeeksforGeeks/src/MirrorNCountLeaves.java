
/**
 * @author ssm
 *
 */
public class MirrorNCountLeaves {
	void mirror(NodeBST node){
		    if(node == null){
		        return;
		    }    
		    mirror(node.left);
		    mirror(node.right);
		    NodeBST temp = node.left;
		    node.left = node.right;
		    node.right = temp;
	    }
	
	int countLeaves(NodeBST node){
	        if(node == null){
	            return 0;
	        }
	        if(node.left == null && node.right == null){
	            return 1;
	        }
	        return countLeaves(node.left)+countLeaves(node.right);
	    }
}
