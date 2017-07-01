import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/remove-a-and-bc-from-a-given-string/
public class RemoveBAC {
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        for(int i=0;i<t;i++){
	            String ip = br.readLine();
	            StringBuilder res = new StringBuilder();
	            for(int j=0;j<ip.length();){
	                char c = ip.charAt(j);
	                if(c == 'b'){
	                    j++;
	                }
	                else if(j < ip.length()-1 && c == 'a' && ip.charAt(j+1) == 'c'){
	                    j+=2;
	                }
	                else{
	                    res.append(c);
	                    j++;
	                }
	            }
	            System.out.println(res);
	        }
		}
}
