
/**
 * @author ssm
 *
 */
public class MaxPathSumBinaryTree {
	    int max;
	    public int maxPathSum(NodeBST root) {
	        max = Integer.MIN_VALUE;
	        maxPathSumUtil(root);
	        return max;
	    }
	    
	    public int maxPathSumUtil(NodeBST root){
	        if(root == null){
	            return 0;
	        }
	        
	        int l = maxPathSumUtil(root.left);
	        int r = maxPathSumUtil(root.right);
	        
	        int maxSingle = Integer.max(Integer.max(l,r)+root.data,root.data);
	        int maxRoot = Integer.max(maxSingle,l+r+root.data);
	        max = Integer.max(max,maxRoot);
	        
	        return maxSingle;
	    }
}
