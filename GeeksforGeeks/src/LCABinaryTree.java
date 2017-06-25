
/**
 * @author ssm
 *
 */
public class LCABinaryTree {
	boolean flag1,flag2;
	NodeBST LCA(NodeBST root, int n1,int n2){
	    if(root == null)
	        return root;
	    
	    flag1 = false;
	    flag2 = false;
	    
	    NodeBST lca = LCAUtil(root,n1,n2);
	    return lca;
	}
	
	NodeBST LCAUtil(NodeBST root,int n1,int n2){
	    if(root == null){
	        return root;
	    }
	    
	    if(root.data == n1){
	        flag1 = true;
	        return root;
	    }
	    if(root.data == n2){
	        flag2 = true;
	        return root;
	    }
	    
	    NodeBST leftLCA = LCAUtil(root.left,n1,n2);
	    NodeBST rightLCA = LCAUtil(root.right,n1,n2);
	    
	    if(leftLCA != null && rightLCA != null){
	        return root;
	    }
	    
	    return leftLCA != null?leftLCA:rightLCA;
	}
}
