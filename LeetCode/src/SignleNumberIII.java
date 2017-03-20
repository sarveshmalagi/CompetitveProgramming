import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class SignleNumberIII {
	public int[] singleNumber(int[] nums) {
		
		//Solution using hashmap - O(n) but not fast enough
        /*HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int[] op = new int[2];
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                op[count++] = entry.getKey();
            }
        }
        return op;*/
		
		//faster than the above solution but try to optimize
		int xor = 0;
		for(int i=0;i<nums.length;i++){
			xor ^= nums[i];
		}
		
		xor &= -xor;
		int[] res = new int[2];
		for(int i=0;i<nums.length;i++){
			if((nums[i]&xor) == 0){
				res[0] ^= nums[i];
			}
			else{
				res[1] ^= nums[i];
			}
		}

		return res;
    }
}
