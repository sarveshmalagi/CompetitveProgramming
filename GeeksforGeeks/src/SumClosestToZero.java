import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class SumClosestToZero {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n < 2)
			    continue;
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			Arrays.sort(arr);
			int l = 0,h = n-1;
			int min_l = 0,min_h = 0,min_sum = 1000000000;
			while(l < h){
				int sum = arr[l]+arr[h];
				if(Math.abs(sum) < Math.abs(min_sum)){
				    min_sum = sum;
				    min_l = l;
				    min_h = h;
				}
				if(sum < 0){
					l++;
				}
				else{
					h--;
				}
			}
			System.out.println(arr[min_l]+" "+arr[min_h]);
		}
	}
}
