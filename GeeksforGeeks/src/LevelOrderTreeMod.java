import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class LevelOrderTreeMod {
	void levelOrder(NodeBST root) {
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
		queue.add(root);
		        
	        while(true){
	            int qSize = queue.size();
	            if(qSize == 0){
	                break;
	            }
	            
	            while(qSize > 0){
                    NodeBST curr = queue.poll();
                    System.out.print(curr.data+" ");
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                    qSize--;
	            }
	            System.out.print("$ ");
	        }
	}
}
