
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class SortedArrToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
	        TreeNode root = arrToBST(nums,0,nums.length-1);
	        return root;
	    }
	    
	    public TreeNode arrToBST(int[] nums,int l,int h){
	        if(l > h)
	            return null;
	        int mid = (l+h)/2;
	        TreeNode root = new TreeNode(nums[mid]);
	        root.left = arrToBST(nums,l,mid-1);
	        root.right = arrToBST(nums,mid+1,h);
	        
	        return root;
	    }
}
