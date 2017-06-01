import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MaxIndex {
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
			int[] min = new int[n];
			int[] max = new int[n];
			
			min[0] = arr[0];
			for(int j=1;j<n;j++){
				min[j] = Integer.min(arr[j],min[j-1]);
			}
			
			max[n-1] = arr[n-1];
			for(int j=n-2;j>=0;j--){
				max[j] = Integer.max(arr[j], max[j+1]);
			}
			
			int k = 0,l = 0,maxDiff = 0;
			while(k < n && l < n){
				if(min[k] <= max[l]){
					maxDiff = Integer.max(maxDiff,l-k);
					l++;
				}
				else{
					k++;
				}
			}
			System.out.println(maxDiff);
		}
	}
}
