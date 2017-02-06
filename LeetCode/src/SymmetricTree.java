
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/symmetric-tree/
//try iterative version
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        return SymmetricUtil(root,root);
    }
    
    boolean SymmetricUtil(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && SymmetricUtil(t1.right,t2.left) && SymmetricUtil(t1.left,t2.right);
    }
}
