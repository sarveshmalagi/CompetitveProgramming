
/**
 * @author ssm
 *
 */
public class HeapProperty {
	boolean isHeap(NodeBST tree){
		    if(tree == null || tree.left == null || tree.right == null){
		        return true;
		    }
		    
		    if(tree.data < tree.left.data || tree.data < tree.right.data){
		        return false;
		    }
		    
		    return isHeap(tree.left)&&isHeap(tree.right);
	    }
}
