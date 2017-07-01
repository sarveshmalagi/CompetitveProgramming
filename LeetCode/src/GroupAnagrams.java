import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/group-anagrams/
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
	        if(strs.length == 0)
	            new ArrayList<ArrayList<String>>();
	        Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
	        
	        for(String str : strs){
	            char[] strArr = str.toCharArray();
	            Arrays.sort(strArr);
	            String sortedstr = new String(strArr);
	            if(map.containsKey(sortedstr)){
	                ArrayList<String> temp = map.get(sortedstr);
	                temp.add(str);
	                map.put(sortedstr,temp);
	            }
	            else{
	                ArrayList<String> temp = new ArrayList<String>();
	                temp.add(str);
	                map.put(sortedstr,temp);
	            }
	        }
	        
	        //System.out.println(map);
	        List<List<String>> res = new ArrayList<List<String>>();
	        for(Map.Entry<String,ArrayList<String>> entry : map.entrySet()){
	            res.add(entry.getValue());
	        }
	        return res;
	    }
}
