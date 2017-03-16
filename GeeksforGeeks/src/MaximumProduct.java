import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MaximumProduct {
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
			int max1 = -1,max2 = -1;
			for(int j=0;j<n;j++){
				if(arr[j] > max1){
					max1 = arr[j];
				}
			}
			for(int j=0;j<n;j++){
				if(arr[j] > max2 && arr[j] < max1){
					max2 = arr[j];
				}
			}
			System.out.println(max1*max2);
		}
	}
}
