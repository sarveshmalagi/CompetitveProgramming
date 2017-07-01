
/**
 * @author ssm
 *
 */
public class ZigZagStr {
	public String convert(String s, int numRows) {
	        if(s.length() <= 1)
	            return s;
	        StringBuilder[] resArr = new StringBuilder[numRows];
	        
	        for(int i=0;i<numRows;i++){
	            resArr[i] = new StringBuilder();
	        }
	        
	        for(int i=0;i<s.length();){
	            for(int index = 0;index<numRows && i<s.length();index++){
	                resArr[index].append(s.charAt(i++));
	                //System.out.println("1");
	            }
	            for(int index = numRows-2;index >= 1 && i<s.length();index--){
	                resArr[index].append(s.charAt(i++));
	                //System.out.println("2");
	            }
	        }
	        
	        StringBuilder res = new StringBuilder();
	        for(StringBuilder sb : resArr){
	            res.append(sb);
	        }
	        
	        return res.toString();
	    }
}
