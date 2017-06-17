
/**
 * @author ssm
 *
 */
public class RangeBST {
	void Print(NodeBST node, int k1, int k2){
	        if(node == null){
	            return;
	        }
	        
	        if(node.data > k1){
	            Print(node.left,k1,k2);
	        }
	        if(node.data >= k1 && node.data <= k2){
	            System.out.print(node.data+" ");   
	        }
	        if(node.data < k2){
	            Print(node.right,k1,k2);
	        }
	    }
}
