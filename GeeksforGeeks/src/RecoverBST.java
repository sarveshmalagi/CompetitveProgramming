
/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/fix-two-swapped-nodes-of-bst/
//https://leetcode.com/problems/recover-binary-search-tree/#/description
public class RecoverBST {
	NodeBST prev = new NodeBST(Integer.MIN_VALUE);
	NodeBST first = null,second = null;
	    
	    public void recoverTree(NodeBST root) {
	        inorder(root);
	        
	        int temp = first.data;
	        first.data = second.data;
	        second.data = temp;
	    }
	    
	    public void inorder(NodeBST root){
	        if(root == null){
	            return;
	        }
	        
	        inorder(root.left);
	        
	        if(first == null && prev.data >= root.data){
	            first = prev;
	        }
	        
	        if(first != null && prev.data >= root.data){
	            second = root;
	        }
	        prev = root;
	        
	        inorder(root.right);
	    }
}
