import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class Anagram {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String s1 = br.readLine();
			String s2 = br.readLine();
			
			int[] count1 = new int[256];
			int[] count2 = new int[256];
			
			for(int j=0;j<s1.length();j++)
				count1[s1.charAt(j)-' ']++;
			
			for(int j=0;j<s2.length();j++)
				count2[s2.charAt(j)-' ']++;
			
			boolean flag = true;
			for(int j=0;j<256;j++){
				if(count1[j] != count2[j]){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
