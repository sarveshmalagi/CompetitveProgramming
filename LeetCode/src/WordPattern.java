import java.util.HashMap;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/word-pattern/
//try out alternatives
public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
       HashMap<Character,String> hm_pattern = new HashMap<Character,String>();
       String[] str_arr = str.split(" ");
       if(str_arr.length != pattern.length()){
           return false;
       }
       for(int i=0;i<pattern.length();i++){
           char c = pattern.charAt(i);
           if(hm_pattern.containsKey(c)){
               if(!hm_pattern.get(c).equals(str_arr[i])){
                   return false;
               }
           }
           else{
                if(hm_pattern.containsValue(str_arr[i]))
                    return false;
                hm_pattern.put(c,str_arr[i]);   
           }
       }
       return true;
    }
}
