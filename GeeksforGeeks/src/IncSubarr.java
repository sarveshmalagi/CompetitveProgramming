import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class IncSubarr {
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
			
			int len = 1,count = 0;
			for(int j=0;j<n-1;j++){
				if(arr[j] < arr[j+1]){
					len++;
				}
				else{
					count += len*(len-1)/2;
					len = 1;
				}
			}
			
			if(len > 1){
				count += len*(len-1)/2;
			}
			System.out.println(count);
		}
	}
}
