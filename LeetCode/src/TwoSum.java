import java.util.HashMap;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/two-sum/
//Similar problem?
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int low = hm.get(nums[i]);
                return new int[]{low,i};
            }
            else{
                hm.put(target-nums[i],i);
            }
        }
        return new int[2];
    }
}
