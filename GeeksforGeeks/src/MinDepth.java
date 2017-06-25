import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class MinDepth {
	int minDepth(NodeBST root){
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
			queue.add(root);
			int level = 1;
	        while(true){
	            int qSize = queue.size();
	            if(qSize == 0){
	                break;
	            }
	            
	            while(qSize > 0){
	                NodeBST curr = queue.poll();
	                if(isLeaf(curr)){
	                    return level;
	                }
	                if(curr.left != null)
	                    queue.add(curr.left);
	                if(curr.right != null)
	                    queue.add(curr.right);
	                qSize--;
	            }
	            level++;
	        }
	        return -1;
	    }
	    
	    boolean isLeaf(NodeBST root){
	        if(root != null && root.left == null && root.right == null)
	            return true;
	        return false;
	    }
}
