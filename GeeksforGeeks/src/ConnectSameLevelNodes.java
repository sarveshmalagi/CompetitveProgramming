import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */

class NodeMod{
    int data;
    NodeMod left, right, nextRight;

    NodeMod(int item){
        data = item;
        left = right = nextRight = null;
		
    }
}

public class ConnectSameLevelNodes {
	void connect(NodeMod root){
	        Queue<NodeMod> queue = new LinkedList<NodeMod>();
			queue.add(root);
			        
	        while(true){
	            int qSize = queue.size();
	            if(qSize == 0){
	                break;
	            }
	            NodeMod prev = null;
	            while(qSize > 0){
	                NodeMod curr = queue.poll();
	                if(prev != null){
	                    prev.nextRight = curr;
	                }
	                //System.out.print(curr.data+" ");
	                if(curr.left != null)
	                    queue.add(curr.left);
	                if(curr.right != null)
	                    queue.add(curr.right);
	                qSize--;
	                prev = curr;
	            }
	            //System.out.print("$ ");
	        }
	    }
}
