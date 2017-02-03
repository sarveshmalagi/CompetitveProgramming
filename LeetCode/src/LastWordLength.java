
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/length-of-last-word/
public class LastWordLength {
	public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length()-1;
        while(i > 0 && s.charAt(i) == ' '){
            i--;
        }
        for(;i>=0;i--){
            if(s.charAt(i) != ' '){
                length++;
            }
            else{
                break;
            }
        }
        return length;
    }
}
