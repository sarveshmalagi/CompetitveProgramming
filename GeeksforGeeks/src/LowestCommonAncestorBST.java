
/**
 * @author ssm
 *
 */
public class LowestCommonAncestorBST {
	NodeBST lca(NodeBST node, int n1, int n2) {
	        if(node == null)
	            return null;
	        
	        if(node.data >= Integer.min(n1,n2) && node.data <= Integer.max(n2,n1)){
	            return node;  
	        }
	        if(node.data > n1 && node.data > n2){
	            return lca(node.left,n1,n2);
	        }
	        else{
	            return lca(node.right,n1,n2);
	        }
	    }
}
