import java.util.ArrayList;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/binary-tree-paths/
public class BTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> pathList = new ArrayList<String>();
        if(root != null){
            findPath(root,"",pathList);
        }
        return pathList;
    }
    
    void findPath(TreeNode root,String label,List<String> pathList){
        if(root.left == null && root.right == null){
            pathList.add(label+root.val);
        }
        if(root.left != null){
            findPath(root.left,label+root.val+"->",pathList);
        }
        if(root.right != null){
            findPath(root.right,label+root.val+"->",pathList);
        }
    }
}
