import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class TrappingRainWater {
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
			int[] left = new int[n];
			int[] right = new int[n];
			
			left[0] = arr[0];
			for(int j=1;j<n;j++){
				left[j] = left[j-1]>arr[j]?left[j-1]:arr[j];
			}
			right[n-1] = arr[n-1];
			for(int j=n-2;j>=0;j--){
				right[j] = right[j+1]>arr[j]?right[j+1]:arr[j];
			}
			
			int area = 0;
			for(int j=1;j<n-1;j++){
				if((left[j]<right[j]?left[j]:right[j])-arr[j] > 0)
					area += (left[j]<right[j]?left[j]:right[j])-arr[j];
			}
			
			System.out.println(area);
		}
	}
}
