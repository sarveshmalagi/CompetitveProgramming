import java.util.ArrayList;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//use BST property
public class LowestCommonAncestor {
	//for BST
	public TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
        while((p.val < root.val && q.val < root.val) || (p.val > root.val && q.val > root.val)){
            root = p.val < root.val?root.left:root.right;
        }
        return root;
    }
	
	//for Binary Tree
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> search1 = new ArrayList<TreeNode>();
        search(root,p,search1);
        ArrayList<TreeNode> search2 = new ArrayList<TreeNode>();
        search(root,q,search2);
        System.out.println(search1+"\n"+search2);
        int i=0;
        while(i<Integer.min(search1.size(),search2.size()) && search1.get(i).equals(search2.get(i))){
            i++;
        }
        return search1.get(i-1);
    }
    
    void search(TreeNode root,TreeNode q,ArrayList<TreeNode> list){
        if(root == null){
            return;
        }
        list.add(root);
        if(root.val < q.val){
            search(root.right,q,list);
        }
        else if(root.val > q.val){
            search(root.left,q,list);
        }
        else{
            return;
        }
    }
}
