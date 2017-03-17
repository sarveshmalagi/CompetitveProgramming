import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class RotateArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] ip1 = br.readLine().split(" ");
			int n = Integer.parseInt(ip1[0]);
			int d = Integer.parseInt(ip1[1]);
			String[] ip2 = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(ip2[j]);
			}
			int[] rotatedArr = new int[n];
			int count = 0;
			for(int j=d;j<n;j++){
				rotatedArr[j-d] = arr[j];
				count++;
			}
			for(int j=0;j<d;j++){
				rotatedArr[count++] = arr[j];
			}
			
			for(int j=0;j<n;j++){
				System.out.print(rotatedArr[j]+" ");
			}
			System.out.println();
		}
	}
}
