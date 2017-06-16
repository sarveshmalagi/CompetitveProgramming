import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class PythogoreanTriplet {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			for(int j=0;j<n;j++){
				arr[j] *= arr[j];
			}
			Arrays.sort(arr);
			
			for(int j=n-1;j>=2;j--){
				int l = 0,h = j-1;
				while(l < h){
					if(arr[j] == arr[l]+arr[h]){
						System.out.println("Yes");
						continue outer;
					}
					else if(arr[j] > arr[l]+arr[h]){
						l++;
					}
					else{
						h--;
					}
				}
			}
			System.out.println("No");
		}
	}
}
