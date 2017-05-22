import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MaxDiff {
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
			int min = arr[0],maxDiff = arr[1]-arr[0];
			for(int j=1;j<n;j++){
				if(arr[j]-min > maxDiff){
					maxDiff = arr[j]-min;
				}
				if(min > arr[j]){
					min = arr[j];
				}
			}
			System.out.println(maxDiff);
		}
	}
}
