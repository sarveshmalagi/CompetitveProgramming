
/**
 * @author ssm
 *
 */
public class StringLengthEncoding {
	static String encode(String str){
	        int i=0,len = str.length();
	        char prev = str.charAt(0);
	        StringBuilder res = new StringBuilder();
	        
	        while(i < len){
	            int count = 1;
	            i++;
	            while(i < len && str.charAt(i) == prev){
	                count++;
	                i++;
	            }
	            res.append(prev);
	            res.append(count);
	            if(i < len)
	        	    prev = str.charAt(i);
	        }
	        
	        return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(encode("abbbcdddd"));
	}
}
