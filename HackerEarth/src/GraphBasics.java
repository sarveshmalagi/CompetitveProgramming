import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author sarvesh
 *
 */
public class GraphBasics {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip = br.readLine().split(" ");
		int n = Integer.parseInt(ip[0]);
		int m = Integer.parseInt(ip[1]);
		boolean[][] adj = new boolean[n][n];
		for(int i=0;i<m;i++){
			String[] ipn = br.readLine().split(" ");
			adj[Integer.parseInt(ipn[0])-1][Integer.parseInt(ipn[1])-1] = true;
		}
		int q = Integer.parseInt(br.readLine());
		for(int i=0;i<q;i++){
			String[] ipn = br.readLine().split(" ");
			if(adj[Integer.parseInt(ipn[0])-1][Integer.parseInt(ipn[1])-1] == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
