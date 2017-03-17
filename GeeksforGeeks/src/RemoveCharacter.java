import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
public class RemoveCharacter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String s1 = br.readLine();
			String s2 = br.readLine();
			HashSet<Character> hs = new HashSet<Character>();
			for(int j=0;j<s2.length();j++){
				hs.add(s2.charAt(j));
			}
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<s1.length();j++){
				if(!hs.contains(s1.charAt(j))){
					sb.append(s1.charAt(j));
				}
			}
			System.out.println(sb);
		}
	}
}
