import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/minimum-window-substring/
public class MinWindowStr {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
		    String s = br.readLine();
		    String t = br.readLine();
		    if(s.length() < t.length())
		        System.out.println("-1");
		    else
		        System.out.println(minWindow(s,t));
		}
	}
	
	public static String minWindow(String s, String t) {
	        HashMap<Character,Integer> pattern = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> req = new HashMap<Character,Integer>();
	        
	        for(int i=0;i<t.length();i++){
	            if(pattern.containsKey(t.charAt(i))){
	                pattern.put(t.charAt(i),pattern.get(t.charAt(i))+1);
	            }
	            else{
	                pattern.put(t.charAt(i),1);
	            }
	        }
	        
	        int l = 0,count = 0,minLength = Integer.MAX_VALUE;
	        String res = "";
	        for(int i=0;i<s.length();i++){
	            char c = s.charAt(i);
	            if(pattern.containsKey(c)){
	                if(req.containsKey(c)){
	                    if(req.get(c) < pattern.get(c)){
	                        count++;
	                    }
	                    req.put(c,req.get(c)+1);
	                }
	                else{
	                    req.put(c,1);
	                    count++;
	                }
	            }
	            
	            if(count == t.length()){
	                char sc = s.charAt(l);
	                
	                while(!req.containsKey(sc) || req.get(sc) > pattern.get(sc)){
	                    if(req.containsKey(sc) && req.get(sc) > pattern.get(sc)){
	                        req.put(sc,req.get(sc)-1);
	                    }
	                    l++;
	                    sc = s.charAt(l);
	                }
	                
	                if(minLength > i-l+1){
	                    minLength = i-l+1;
	                    res = s.substring(l,i+1);
	                }
	            }
	        }
	        
	        return res.length()==0?"-1":res;
	    }
}
