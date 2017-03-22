
/**
 * @author ssm
 *
 */
public class ArrayProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int[] forward = new int[nums.length];
        int[] backward = new int[nums.length];
        int product = 1;
        for(int i=0;i<nums.length;i++){
            forward[i] = product*nums[i];
            product *= nums[i];
        }
        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            backward[i] = product*nums[i];
            product *= nums[i];
        }
        int[] res = new int[nums.length];
        res[0] = backward[1];
        for(int i=1;i<nums.length-1;i++){
            res[i] = forward[i-1]*backward[i+1];
        }
        res[nums.length-1] = forward[nums.length-2];
        return res;
    }
}
