import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class MinDiffArr {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			Arrays.sort(arr);
			int minDiff = Integer.MAX_VALUE;
			for(int j=0;j<n-1;j++){
				if(arr[j+1] - arr[j] < minDiff){
					minDiff = arr[j+1] - arr[j];
				}
			}
			System.out.println(minDiff);
		}
	}
}
