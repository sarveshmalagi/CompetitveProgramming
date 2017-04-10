import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MIssingNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n-1];
			for (int j = 0; j < n-1; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			int xor1 = arr[0],xor2 = 1;
			for(int j=1;j<n-1;j++){
				xor1 ^= arr[j];
			}
			for(int j=2;j<=n;j++){
				xor2 ^= j;
			}
			System.out.println(xor1^xor2);
		}
	}
}
