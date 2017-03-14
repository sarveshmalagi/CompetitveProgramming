import java.util.Arrays;

/**
 * @author ssm
 *
 */
//try to O(n) solution using quick select algorithm
public class MinMovesII {
	public int minMoves2(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int moves = 0;
        for(int i=0;i<nums.length;i++){
            moves += Math.abs(nums[i]-median);
        }
        return moves;
    }
}
