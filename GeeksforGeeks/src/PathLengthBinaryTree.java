
/**
 * @author ssm
 *
 */

public class PathLengthBinaryTree {
	int findDist(NodeBST root, int a, int b){
	        NodeBST lca = LCA(root,a,b);
	        return getDistance(lca,a,0)+getDistance(lca,b,0);	//alternate?
	    }
	    
	    int getDistance(NodeBST root,int key,int dist){
	        if(root == null){
	            return -1;
	        }
	        
	        if(root.data == key){
	            return dist;
	        }
	        int leftDist = getDistance(root.left,key,dist+1);
	        return leftDist != -1?leftDist:getDistance(root.right,key,dist+1);
	    }
	    
	    NodeBST LCA(NodeBST root, int n1,int n2){
		    if(root == null)
		        return root;
		    NodeBST lca = LCAUtil(root,n1,n2);
		    return lca;
		}
		
		NodeBST LCAUtil(NodeBST root,int n1,int n2){
		    if(root == null){
		        return root;
		    }
		    
		    if(root.data == n1){
		        return root;
		    }
		    if(root.data == n2){
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
