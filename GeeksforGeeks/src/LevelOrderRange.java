import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class LevelOrderRange {
	void levelOrder(NodeBST root,int low,int high) {
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
		queue.add(root);
		int currLevel = 1;
		
	        while(true){
	            int qSize = queue.size();
	            if(qSize == 0){
	                break;
	            }
	            
	            while(qSize > 0){
                    NodeBST curr = queue.poll();
                    if(currLevel >= low && currLevel <= high)
                	    System.out.print(curr.data+" ");
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                    qSize--;
	            }
	            System.out.println();
	            currLevel++;
	        }
	}
}
