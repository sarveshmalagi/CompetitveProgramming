import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class PalindromicArr {
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
			
			int count = 0;
			int l = 0,h = n-1;
			
			while(l <= h){
				if(arr[l] == arr[h]){
					h--;
					l++;
				}
				else if(arr[l] > arr[h]){
					h--;
					arr[h] += arr[h+1];
					count++;
				}
				else{
					l++;
					arr[l] += arr[l-1];
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
