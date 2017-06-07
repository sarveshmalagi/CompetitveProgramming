import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class CountTriangles {
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
			System.out.println(countTriangles(arr,n));
		}
	}
	
	static int countTriangles(int[] arr,int n){
		int count = 0;
		for(int i=0;i<n-2;i++){
			int k = i+2;
			for(int j=i+1;j<n;j++){
				while(k < n && arr[i]+arr[j] > arr[k]){
					k++;
				}
				count += k-j-1;
			}
		}
		return count;
	}
}
