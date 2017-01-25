
/**
 * @author ssm
 *https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0,sum,i=0;
        while(i<nums.length){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            if(count > max){
                max = count;
            }
            i++;
        }
        return max;
    }
}
