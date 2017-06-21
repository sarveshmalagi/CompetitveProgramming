
/**
 * @author ssm
 *
 */
public class MaximumWidthBinaryTree {
	int getMaxWidth(NodeBST root){
	        int[] count = new int[101];
	        getMaxWidthUtil(root,count,0);
	        int max = Integer.MIN_VALUE;
	        for(int i=0;i<101;i++){
	            if(count[i] > max)
	                max = count[i];
	        }
	        return max;
	    }
	    
	    void getMaxWidthUtil(NodeBST root,int[] count,int level){
	        if(root == null){
	            return;
	        }
	        count[level]++;
	        getMaxWidthUtil(root.left,count,level+1);
	        getMaxWidthUtil(root.right,count,level+1);
	    }
}
