
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/detect-capital/#/description
public class DetectCapital {
	public boolean detectCapitalUse(String word) {
	        int upper = 0,len = word.length();
	        for(int i=0;i<len;i++){
	            if(Character.isUpperCase(word.charAt(i)))
	                upper++;
	        }
	        
	        if(upper == 1)
	            return Character.isUpperCase(word.charAt(0));
	        return upper == 0 || upper == len;
	    }
}
