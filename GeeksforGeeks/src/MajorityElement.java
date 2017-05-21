import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MajorityElement {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			int count = 1,majIndex = 0;
			for(int j=1;j<n;j++){
				if(arr[j] == arr[majIndex]){
					count++;
				}
				else{
					count--;
				}
				if(count == 0){
					majIndex = j;
					count = 1;
				}
			}
			count = 0;
			for(int j=0;j<n;j++){
				if(arr[j] == arr[majIndex]){
					count++;
				}
			}
			if(count > n/2){
				System.out.println(arr[majIndex]);
			}
			else{
				System.out.println("NO Majority Element");
			}
		}
	}
}
