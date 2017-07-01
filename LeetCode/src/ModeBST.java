import java.util.ArrayList;

/**
 * @author ssm
 *
 */
public class ModeBST {
	int prev = -1,count = 1,maxCount = 0;
	    ArrayList<Integer> res;
	    public int[] findMode(TreeNode root) {
	        res = new ArrayList<Integer>();
	        inorder(root);
	        int[] resArr = new int[res.size()];
	        for(int i=0;i<res.size();i++){
	            resArr[i] = res.get(i);
	        }
	        
	        return resArr;
	    }
	    
	    void inorder(TreeNode root){
	        if(root == null)
	            return;
	        inorder(root.left);
	        if(prev != -1){
	            if(root.val == prev){
	                count++;
	            }
	            else
	                count = 1;
	        }
	        if(count > maxCount){
	            maxCount = count;
	            res.clear();
	            res.add(root.val);
	        }
	        else if(count == maxCount){
	            res.add(root.val);
	        }
	        prev = root.val;
	        inorder(root.right);
	    }
}
