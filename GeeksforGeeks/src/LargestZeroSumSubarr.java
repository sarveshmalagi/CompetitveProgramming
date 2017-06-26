import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class LargestZeroSumSubarr {
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
			
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			int maxLen = 0,sum = 0;
			
			for(int j=0;j<n;j++){
				sum += arr[j];
				
				if(arr[j] == 0 && sum == 0)
					sum = 1;
				
				if(sum == 0)
					maxLen = j+1;
				
				if(map.containsKey(sum)){
					maxLen = Integer.max(maxLen,j-map.get(sum));
				}
				else{
					map.put(sum, j);
				}
			}
			System.out.println(maxLen);
		}
	}
}
