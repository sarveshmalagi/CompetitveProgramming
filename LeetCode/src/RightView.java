import java.util.ArrayList;
import java.util.List;

/**
 * @author ssm
 *
 */
public class RightView {
	public List<Integer> rightSideView(TreeNode root) {
	        List<Integer> res = new ArrayList<Integer>();
	        rightUtil(root,res,0);
	        return res;
	    }
	    
	    void rightUtil(TreeNode root,List<Integer> res,int depth){
	        if(root == null)
	            return;
	        
	        if(depth == res.size()){
	            res.add(root.val);
	        }
	        
	        rightUtil(root.right,res,depth+1);
	        rightUtil(root.left,res,depth+1);
	    }
}
