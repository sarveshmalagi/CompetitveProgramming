import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 * @author ssm
 *
 */
public class RemoveDupsString {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++){
		    String ip = br.readLine();
		    LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		    for(int j=0;j<ip.length();j++){
		        hs.add(ip.charAt(j));
		    }
		    
		    for(Character c : hs)
		        System.out.print(c);
		    System.out.println();
		}
	}
}
