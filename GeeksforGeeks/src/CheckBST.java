
/**
 * @author ssm
 *
 */
public class CheckBST {
	
	int isBST(NodeBST root)  {
	        return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE)?1:0;
	    }
	    
	    boolean isBSTUtil(NodeBST root,int min,int max){
	        if(root == null){
	            return true;
	        }
	        
	        if(root.data < min || root.data > max){
	            return false;
	        }
	        
	        return (isBSTUtil(root.left,min,root.data-1)&&isBSTUtil(root.right,root.data+1,max));
	    }
}
