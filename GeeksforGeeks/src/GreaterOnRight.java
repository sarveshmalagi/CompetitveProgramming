import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class GreaterOnRight {
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
			int[] max_arr = new int[n];
			max_arr[n-1] = -1;
			for(int j=n-2;j>=0;j--){
				if(arr[j+1] > max_arr[j+1]){
					max_arr[j] = arr[j+1];
				}
				else{
					max_arr[j] = max_arr[j+1];
				}
			}
			for(int j=0;j<n;j++){
				System.out.print(max_arr[j]+" ");
			}
			System.out.println();
		}
	}
}
