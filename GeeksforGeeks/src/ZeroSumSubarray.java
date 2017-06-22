import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
public class ZeroSumSubarray {
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
			HashSet<Integer> hs = new HashSet<Integer>();
			int sum = 0;
			boolean flag = false;
			
			for(int j=0;j<n;j++){
				sum += arr[j];
				if(sum == 0 || arr[j] == 0 || hs.contains(sum)){
					flag = true;
				}
				hs.add(sum);
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
