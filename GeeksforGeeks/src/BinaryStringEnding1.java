import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class BinaryStringEnding1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String ip = br.readLine();
			int count = 0;
			for(int j=0;j<n;j++){
				if(ip.charAt(j) == '1')
					count++;
			}
			System.out.println(count*(count-1)/2);
		}
	}
}
