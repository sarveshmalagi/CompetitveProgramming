
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/valid-palindrome/
//check out other useful methods of character class
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        if(s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int low = 0,high = s.length()-1;
        while(low < high){
            char char_low = s.charAt(low),char_high = s.charAt(high);
            //System.out.println(char_low + " "+ char_high);
            if(char_low != char_high && (Character.isLetter(char_low) || Character.isDigit(char_low)) && (Character.isLetter(char_high) || Character.isDigit(char_high))){
                return false;
            }
            if(!Character.isLetter(char_low) && !Character.isDigit(char_low)){
                low++;
                continue;
            }
            if(!Character.isLetter(char_high) && !Character.isDigit(char_high)){
                high--;
                continue;
            }
            low++;
            high--;
        }
        return true;
    }
}
