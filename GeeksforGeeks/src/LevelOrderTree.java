import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */

class LevelOrderTree{
	void levelOrder(NodeBST node) {
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
	        queue.add(node);
	        
	        while(!queue.isEmpty()){
	            NodeBST curr = queue.poll();
	            System.out.print(curr.data+" ");
	            if(curr.left != null)
	                queue.add(curr.left);
	            if(curr.right != null)
	                queue.add(curr.right);
	        }
	    }
}
