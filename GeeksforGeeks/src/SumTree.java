
/**
 * @author ssm
 *
 */
public class SumTree {
	boolean isSumTree(NodeBST node){
	        return (isSumUtil(node)!=-1);
		}
		
		int isSumUtil(NodeBST node){
		    if(node == null){
		        return 0;
		    }
		    if(node.left == null && node.right == null){
		        return node.data;
		    }
		    
		    int leftSum = isSumUtil(node.left);
		    int rightSum = isSumUtil(node.right);
		    
		    if(node.data == leftSum+rightSum){
		        return node.data+leftSum+rightSum;
		    }
		    return -1;
		}
}
