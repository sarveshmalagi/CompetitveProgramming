import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/palindrome-pairs/
public class PalindromePairs {
	public List<List<Integer>> palindromePairs(String[] words) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        
	        for(int i=0;i<words.length;i++){
	            map.put(words[i],i);
	        }
	        
	        if(map.containsKey("")){
	            int index = map.get("");
	            for(int i=0;i<words.length;i++){
	                if(isPalindrome(words[i])){
	                    if(index == i)
	                        continue;
	                    res.add(Arrays.asList(index,i));
	                    res.add(Arrays.asList(i,index));
	                }
	            }
	        }
	        
	        for(int i=0;i<words.length;i++){
	            if(isPalindrome(words[i]) && map.containsKey(reverseStr(words[i]))){
	                int index = map.get(reverseStr(words[i]));
	                if(index == i)
	                    continue;
	                res.add(Arrays.asList(i,index));
	            }
	        }
	        
	        for(int i=0;i<words.length;i++){
	            String curr = words[i];
	            for(int j=0;j<words[i].length();j++){
	                if(isPalindrome(curr.substring(0,j))){
	                    String rev = reverseStr(curr.substring(j));
	                    if(map.containsKey(rev)){
	                        int index = map.get(rev);
	                        if(index == i)
	                            continue;
	                        res.add(Arrays.asList(index,i));
	                    }
	                }
	                
	                if(isPalindrome(curr.substring(j))){
	                    String rev = reverseStr(curr.substring(0,j));
	                    if(map.containsKey(rev)){
	                        int index = map.get(rev);
	                        if(index == i)
	                            continue;
	                        res.add(Arrays.asList(i,index));
	                    }
	                }
	            }
	        }
	        return res;
	    }
	    
	    public String reverseStr(String str){
	    StringBuilder sb= new StringBuilder(str);
	    return sb.reverse().toString();
	    }
	    
	    public boolean isPalindrome(String s){
	        int i = 0;
	        int j = s.length() - 1;
	        while(i <= j){
	            if(s.charAt(i) != s.charAt(j)){
	                return false;
	            }
	            i++;
	            j--;
	        }
	        return true;
	    }
}
