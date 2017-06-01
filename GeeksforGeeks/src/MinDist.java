import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MinDist {
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
			String[] temp1 = br.readLine().split(" ");
			int x = Integer.parseInt(temp1[0]);
			int y = Integer.parseInt(temp1[1]);
			
			int k = 0,prev = 0;
			for(;k<n;k++){
				if(arr[k] == x || arr[k] == y){
					prev = k;
					break;
				}
			}
			
			int minDist = Integer.MAX_VALUE;
			for(;k<n;k++){
				if(arr[k] == x || arr[k] == y){
					if(arr[prev] != arr[k] && k - prev < minDist){
						minDist = k - prev;
						prev = k;
					}
					else{
						prev = k;
					}
				}
			}
			System.out.println(minDist<Integer.MAX_VALUE?minDist:"-1");
		}
	}
}
