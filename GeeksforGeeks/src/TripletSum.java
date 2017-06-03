import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class TripletSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int sum = Integer.parseInt(ip[1]);
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			Arrays.sort(arr);
			boolean flag = false;
			for(int j=0;j<n-2;j++){
				int l = j+1,r = n-1;
				while(l < r){
					if(arr[j]+arr[l]+arr[r] == sum){
						System.out.println("1");
						flag = true;
						continue outer;
					}
					else if(arr[j]+arr[l]+arr[r] < sum){
						l++;
					}
					else{
						r--;
					}
				}
			}
			if(!flag)
				System.out.println("0");
		}
	}
}
