
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/minimum-depth-of-binary-tree/
//IP : [1,2] - catch
public class MinDepthTree {
	public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.right != null && root.left != null){
            return 1 + Integer.min(minDepth(root.right),minDepth(root.left));
        }
        else if(root.right != null){
            return 1 + minDepth(root.right);
        }
        else{
            return 1 + minDepth(root.left);
        }
    }
}
