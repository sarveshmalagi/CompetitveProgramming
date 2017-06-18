
/**
 * @author ssm
 *
 */
public class AddGreaterBST {
	int maxSum = 0;
	    void modify(NodeBST root){
	        modifyUtil(root);
	        //inorder(root);
	    }
	    
	    void modifyUtil(NodeBST root){
	        if(root == null){
		        return;
		    }
		    modifyUtil(root.right);
		    maxSum += root.data;
		    root.data = maxSum;
		    modifyUtil(root.left);    
	    }
	    
	    void inorder(NodeBST root){
	        if (root != null){
	            inorder(root.left);
	            System.out.print(root.data+" ");
	            inorder(root.right);
	        }
	    }
}
