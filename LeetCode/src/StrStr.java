
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/implement-strstr/
public class StrStr {
	public int strStr(String haystack, String needle) {
	        if(needle.length() == 0)
	            return 0;
	        int[] prefix = calculatePrefixArr(needle);
	        return Kmp(haystack,needle,prefix);
	    }
	    
	    static int[] calculatePrefixArr(String ip){
			int[] lps = new int[ip.length()];
			
			int j = 0;
			lps[0] = 0;
			for(int i=1;i<ip.length();){
				if(ip.charAt(i) == ip.charAt(j)){
					lps[i] = j+1;
					i++;
					j++;
				}
				else{
					if(j != 0){
						j = lps[j-1];
					}
					else{
						lps[i] = 0;
						i++;
					}
				}
			}
			
			return lps;
		}
		
		static int Kmp(String ip,String pattern,int[] lps){
			int i= 0 ,j = 0,index = -1;
			
			while(i < ip.length() && j < pattern.length()){
				if(ip.charAt(i) == pattern.charAt(j)){
					i++;
					j++;
				}
				else{
					if(j != 0){
						j = lps[j-1];
					}
					else{
						i++;
					}
				}
			}
			
			if(j == pattern.length()){
				return i-pattern.length();
			}
			return -1;
		}
}
