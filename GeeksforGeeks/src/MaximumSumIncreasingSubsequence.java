import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MaximumSumIncreasingSubsequence {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] ip = br.readLine().split(" ");
			int[] arr = new int[n];
			for(int j=0;j<n;j++){
				arr[j] = Integer.parseInt(ip[j]);
			}
			int[] table = new int[n];
			for(int j=0;j<n;j++){
				table[j] = arr[j];
			}
			for(int j=1;j<n;j++){
				for(int k=0;k<j;k++){
					if(arr[k] < arr[j] && arr[j]+table[k] > table[j]){
						table[j] = table[k]+arr[j];
					}
				}
			}
			int max = table[0];
			for(int j=1;j<n;j++){
				if(max < table[j])
					max = table[j];
			}
			System.out.println(max);
		}
	}
}
