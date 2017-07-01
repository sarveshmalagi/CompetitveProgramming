import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
	        if(strs.length == 0)
	            return "";
	            
	        Arrays.sort(strs);
	        String low = strs[0];
	        String high = strs[strs.length-1];
	        
	        StringBuilder prefix = new StringBuilder();
	        for(int i=0,j=0;i<low.length();i++){
	            if(j < high.length() && low.charAt(i) == high.charAt(j)){
	                prefix.append(low.charAt(i));
	                j++;
	            }
	            else{
	                break;
	            }
	        }
	        return prefix.toString();
	    }
}
