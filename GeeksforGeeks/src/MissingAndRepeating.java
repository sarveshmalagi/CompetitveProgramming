import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MissingAndRepeating {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			int[] count = new int[n+1];
			int repeating = 0,missing = 0;
			for(int j=0;j<n;j++){
				if(count[arr[j]] == 1){
					repeating = arr[j];
					count[arr[j]]++;
				}
				count[arr[j]]++;
			}
			
			for(int j=0;j<n;j++){
				if(count[j] == 0){
					missing = j;
				}
			}
			System.out.println(repeating+" "+missing);
		}
	}
}
