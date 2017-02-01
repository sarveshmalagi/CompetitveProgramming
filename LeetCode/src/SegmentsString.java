
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/number-of-segments-in-a-string/
public class SegmentsString {
	public int countSegments(String s) {
        int count = 0;
        if(s.length() == 0)
            return count;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != ' ' && s.charAt(i+1) == ' ')
                count++;
        }
        if(s.charAt(s.length()-1) != ' ')
            count++;
        return count;
    }
}
