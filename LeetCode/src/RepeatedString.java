
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/repeated-substring-pattern/
public class RepeatedString {
	public boolean repeatedSubstringPattern(String str) {
        int i = str.length()/2;
        for(;i>=1;i--){
            if(str.length()%i == 0){
                int m = str.length()/i;
                String sub = str.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<m;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }
}
