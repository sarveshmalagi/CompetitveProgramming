import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class CountHops {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			int[] table = new int[n+1];
			table[1] = 1;
			if(n > 1)
				table[2] = 2;
			if(n > 2)
				table[3] = 4;
			for(int j=4;j<=n;j++){
				table[j] = table[j-1]+table[j-2]+table[j-3];
			}
			System.out.println(table[n]);
		}
	}
}
