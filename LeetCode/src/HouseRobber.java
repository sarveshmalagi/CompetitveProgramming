
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/house-robber/
public class HouseRobber {
	public int rob(int[] nums) {
        int[] dp_arr = new int[nums.length];
        if(nums.length == 0){
            return 0;
        }
        if(nums.length >= 1){
            dp_arr[0] = nums[0];
        }
        if(nums.length >= 2)
            dp_arr[1] = Integer.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp_arr[i] = Integer.max(dp_arr[i-1],dp_arr[i-2]+nums[i]);
        }
        return dp_arr[dp_arr.length-1];
    }
}
