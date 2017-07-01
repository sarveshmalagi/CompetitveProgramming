import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class MaxUniqueSub {
	public int lengthOfLongestSubstring(String s) {
	        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
	        int len = s.length(),maxLen = Integer.MIN_VALUE;
	        
	        if(len == 0)
	            return 0;
	        for(int l = 0,h = 0;h < len;h++){
	            if(map.containsKey(s.charAt(h))){
	                l = Integer.max(l,map.get(s.charAt(h))+1);
	            }
	            map.put(s.charAt(h),h);
	            maxLen = Integer.max(maxLen,h-l+1);
	        }
	        return maxLen;
	    }
}
