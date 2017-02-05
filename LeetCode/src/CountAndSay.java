
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/count-and-say/
public class CountAndSay {
	public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        if(n == 1){
            return sb.toString();
        }
        for(int i=2;i<=n;i++){
            StringBuilder sb_temp = new StringBuilder();
            for(int j=0;j<sb.length();){
                char c = sb.charAt(j);
                int count = 0;
                while(j<sb.length() && sb.charAt(j) == c){
                    count++;
                    j++;
                }
                sb_temp.append(count);
                sb_temp.append(c);
            }
            sb.delete(0,sb.length());
            for(int k=0;k<sb_temp.length();k++){
                sb.append(sb_temp.charAt(k));
            }
        }
        return sb.toString();
    }
}
