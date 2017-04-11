import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
//try the O(n) solution using max heap
public class WaveArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			Arrays.sort(arr);
			for(int j=1;j<n;j+=2){
				int swap = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = swap;
			}
			
			for(int j=0;j<n;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
