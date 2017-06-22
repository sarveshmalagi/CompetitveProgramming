import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ssm
 *
 */
public class ReverseLevelOrder {
	void reversePrint(NodeBST node){
		    if(node == null)
		        return;
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
	        Stack<NodeBST> stack = new Stack<NodeBST>();
		    queue.add(node);
		        
	        while(!queue.isEmpty()){
	            NodeBST curr = queue.poll();
	            stack.push(curr);
	            if(curr.right != null)
	                queue.add(curr.right);
	            if(curr.left != null)
	                queue.add(curr.left);
	        }
	        
	        while(!stack.isEmpty()){
	            System.out.print(stack.pop().data+" ");
	        }
	    }
}
