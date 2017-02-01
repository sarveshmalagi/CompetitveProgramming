
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/maximum-subarray/
public class MaxSubArray {
	public int maxSubArray(int[] nums) {
        int max_end_here = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            max_end_here += nums[i];
            if(max < max_end_here){
                max = max_end_here;
            }
            if(max_end_here < 0){
                max_end_here = 0;
            }
        }
        return max;
    }
}
