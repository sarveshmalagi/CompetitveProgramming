import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class LevelOrderMul {
	static void levelOrder(NodeBST root) {
		ArrayList<Integer> sums = new ArrayList<Integer>();
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
		queue.add(root);
		        
	        while(true){
	            int sum = 0;
	            int qSize = queue.size();
	            if(qSize == 0){
	                break;
	            }
	            
	            while(qSize > 0){
                    NodeBST curr = queue.poll();
                    if(isLeaf(curr)){
                	    sum += curr.data;
                    }
                    if(curr.left != null)
                        queue.add(curr.left);
                    if(curr.right != null)
                        queue.add(curr.right);
                    qSize--;
	            }
	            sums.add(sum);
	        }
	        int product = 1;
	        for(int x : sums){
	            if(x != 0)
	        	    product *= x;
	        }
	        System.out.println(product);
	}
	
	
	static boolean isLeaf(NodeBST root){
		if(root != null && root.left == null && root.right == null)
			return true;
		return false;
	}
}
