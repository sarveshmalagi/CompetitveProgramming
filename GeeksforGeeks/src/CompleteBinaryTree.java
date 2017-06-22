import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class CompleteBinaryTree {
	boolean isCompleteBT(NodeBST root){
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
	        boolean flag = false;
		    queue.add(root);
		        
		        while(!queue.isEmpty()){
		            NodeBST curr = queue.poll();
		            //System.out.print(curr.data+" ");
		            if(curr.left != null){
		                if(flag){
		                    return false;
		                }
		                queue.add(curr.left);   
		            }
		            else
		                flag = true;
		            if(curr.right != null){
		                if(flag){
		                    return false;
		                }
		                queue.add(curr.right);   
		            }
		            else
		                flag = true;
		        }
		        return true;
		}
}
