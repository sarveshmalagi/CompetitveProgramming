import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MaxSumWithoutAdj {
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
			int incl = arr[0],excl = 0;
			for(int j=1;j<n;j++){
				int incl_temp = excl+arr[j];
				excl = Integer.max(incl, excl);
				incl = incl_temp;	//assign at the end of each iteration
			}
			System.out.println(Integer.max(incl, excl));
		}
	}
}
