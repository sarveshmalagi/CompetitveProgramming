import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
public class KthDistance {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[1]);
			int k = Integer.parseInt(ip[0]);
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int j=0;j<=k;j++){
				if(!hs.add(arr[j])){
					System.out.println("True");
					continue outer;
				}
				
			}
			//System.out.println(hs);
			for(int j=k+1;j<n;j++){
				hs.remove(arr[j-k-1]);
				if(!hs.add(arr[j])){
					System.out.println("True");
					continue outer;
				}
				//System.out.println(hs);
			}
			System.out.println("False");
		}
	}
}
