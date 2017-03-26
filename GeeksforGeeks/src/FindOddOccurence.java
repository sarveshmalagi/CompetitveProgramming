import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class FindOddOccurence {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			int xor = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
				xor ^= arr[j];
			}
			System.out.println(xor);
		}
	}
}
