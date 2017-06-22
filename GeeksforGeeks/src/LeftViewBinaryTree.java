import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class LeftViewBinaryTree {
	void leftView(NodeBST root){
	        if(root == null)
	            return;
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
			queue.add(root);
			        
		        while(true){
		            int qSize = queue.size();
		            if(qSize == 0){
		                break;
		            }
		            boolean flag = true;
		            while(qSize > 0){
	                    NodeBST curr = queue.poll();
	                    if(flag){
	                        System.out.print(curr.data+" ");
	                        flag = false;
	                    }
	                    if(curr.left != null)
	                        queue.add(curr.left);
	                    if(curr.right != null)
	                        queue.add(curr.right);
	                    qSize--;
		            }
		        }
	    }
}
