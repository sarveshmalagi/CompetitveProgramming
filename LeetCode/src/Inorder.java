import java.util.ArrayList;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class Inorder {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<Integer>();
        inorderUtils(root,resList);
        return resList;
    }
    
    public void inorderUtils(TreeNode root,List<Integer> resList){
        if(root == null){
            return;
        }
        if(root.left != null){
            inorderUtils(root.left,resList);
        }
        resList.add(root.val);
        if(root.right != null){
            inorderUtils(root.right,resList);
        }
    }
}
