
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/isomorphic-strings/
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        int[] s_arr = new int[256];
        int[] t_arr = new int[256];
        
        for(int i=0;i<s.length();i++){
            if(s_arr[s.charAt(i)] != t_arr[t.charAt(i)]){
                return false;
            }
            s_arr[s.charAt(i)] = t_arr[t.charAt(i)] = i+1;
        }
        return true;
    }
}
