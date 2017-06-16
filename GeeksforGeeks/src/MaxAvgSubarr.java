import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MaxAvgSubarr {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			int sum = 0;
			for(int j=0;j<k;j++){
				sum += arr[j];
			}
			
			int maxSum = sum,maxIndex = k-1;
			for(int j=k;j<n;j++){
				sum = sum + arr[j]-arr[j-k];
				if(sum > maxSum){
					maxSum = sum;
					maxIndex = j;
				}
			}
			
			for(int j=maxIndex-k+1;j<=maxIndex;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
