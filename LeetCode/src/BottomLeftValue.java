import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/find-bottom-left-tree-value/
public class BottomLeftValue {
	public int findBottomLeftValue(TreeNode root) {
	        if(root.left == null && root.right == null)
	            return root.val;

	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        TreeNode last = root;
	        
	        while(true){
	            int qSize = queue.size();
	            if(qSize == 0){
	                break;
	            }
	            
	            while(qSize > 0){
	                TreeNode curr = queue.poll();
	                last = curr;
	                //System.out.print(curr.data+" ");
	                if(curr.right != null){
	                    queue.add(curr.right);
	                }
	                if(curr.left != null){
	                    queue.add(curr.left);
	                }
	                qSize--;
	            }
	            //System.out.print("$ ");
	        }
	        return last.val;
	    }
}
