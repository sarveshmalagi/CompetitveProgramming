import java.util.ArrayList;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/find-all-anagrams-in-a-string/
//look for better solution
public class FindAllAnagrams {
	public List<Integer> findAnagrams(String s, String p) {
        int s_len = s.length(),p_len = p.length();
        List<Integer> ret_list = new ArrayList<Integer>();
        if(s_len == 0 || s_len<p_len){
            return ret_list;
        }
        int[] tab = new int[26];
        for(int i=0;i<p_len;i++){
            tab[s.charAt(i)-'a']++;
        }
        if(isAnagram(tab,p,p_len)){
            ret_list.add(0);
        }
        for(int i=1;i<=s_len-p_len;i++){
            tab[s.charAt(i-1)-'a']--;
            tab[s.charAt(i+p_len-1)-'a']++;
            if(isAnagram(tab,p,p_len)){
                ret_list.add(i);
            }
        }
        return ret_list;
    }
    
    public boolean isAnagram(int[] tab,String p,int p_len){
        int[] tab_p = new int[26];
        for(int i=0;i<p_len;i++){
            tab_p[p.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(tab[i] != tab_p[i]){
                return false;
            }
        }
        return true;
    }
}
