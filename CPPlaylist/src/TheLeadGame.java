import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class TheLeadGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int maxLead = 0,leader = 0,lead1 = 0,lead2 = 0;
		for(int i=0;i<n;i++){
			String[] ip = br.readLine().split(" ");
			int s1 = Integer.parseInt(ip[0]);
			int s2 = Integer.parseInt(ip[1]);
			lead1 += s1-s2;
			lead2 += s2-s1;
			
			if(lead1 > maxLead){
				maxLead = lead1;
				leader = 1;
			}
			if(lead2 > maxLead){
				maxLead = lead2;
				leader = 2;
			}
		}
		System.out.println(leader+" "+maxLead);
	}
}
