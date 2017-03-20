import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class KeypadTyping {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<t;i++){
		    String ip = br.readLine();
		    StringBuilder op = new StringBuilder();
		    for(int j=0;j<ip.length();j++){
		        char c = ip.charAt(j);
		        if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
		            op.append("7");
		        }
		        else if(c == 'w' || c == 'x' || c == 'y' || c == 'z'){
		            op.append("9");
		        }
		        else if(c == 't' || c == 'u' || c == 'v'){
		            op.append("8");
		        }
		        else{
		            op.append((ip.charAt(j)-'a')/3 + 2);
		        }
		    }
		    System.out.println(op);
		}
	}
}
