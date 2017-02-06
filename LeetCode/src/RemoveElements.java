
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/remove-element/
public class RemoveElements {
	public int removeElement(int[] nums, int val) {
        int i=0,j=0;
        while(j < nums.length){
            if(nums[j] != val){
                nums[i++] = nums[j];
            }
            j++;
        }
        return i;
    }
}
