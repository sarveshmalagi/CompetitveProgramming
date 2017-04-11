import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
public class ReverseSubarray {
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
			String[] limits = br.readLine().split(" ");
			int l = Integer.parseInt(limits[0]);
			int h = Integer.parseInt(limits[1]);
			l--;
			h--;
			while(l < h){
				int swap = arr[l];
				arr[l] = arr[h];
				arr[h] = swap;
				l++;
				h--;
			}
			
			for(int j=0;j<n;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
