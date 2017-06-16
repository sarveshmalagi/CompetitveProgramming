
/**
 * @author ssm
 *
 */
public class DeleteBST {
	NodeBST deleteNode(NodeBST root, int key) {
		    if(root == null){
		        return root;
		    }
		    
		    if(key < root.data){
		        root.left = deleteNode(root.left,key);
		    }
		    else if(key > root.data){
		        root.right = deleteNode(root.right,key);
		    }
		    else{
		        if(root.left == null){
		            return root.right;
		        }
		        if(root.right == null){
		            return root.left;
		        }
		        
		        root.data = inorderSuccessor(root.right);
		        root.right = deleteNode(root.right,root.data);
		    }
		    return root;
	    }
	    
	    int inorderSuccessor(NodeBST root){
	        int min = root.data;
	        
	        while(root.left != null){
	            min = root.left.data;
	            root = root.left;
	        }
	        return min;
	    }
}
