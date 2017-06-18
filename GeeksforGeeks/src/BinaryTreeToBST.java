import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ssm
 *
 */
public class BinaryTreeToBST {
	ArrayList<Integer> inorder;
	    NodeBST binaryTreeToBST(NodeBST root){
	        inorder = new ArrayList<Integer>();
	        inorderTraversal(root);
	        Collections.sort(inorder);
	        convert(root);
	        
	        return root;
	    }
	    
	    void inorderTraversal(NodeBST root){
	        if(root != null){
	            inorderTraversal(root.left);
	            inorder.add(root.data);
	            inorderTraversal(root.right);
	        }
	    }
	    
	    void convert(NodeBST root){
	        if(root != null){
	            convert(root.left);
	            root.data = inorder.get(0);
	            inorder.remove(0);
	            convert(root.right);
	        }
	    }
}
