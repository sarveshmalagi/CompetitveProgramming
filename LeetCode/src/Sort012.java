import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class Sort012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			int zeros = 0,ones = 0,twos = 0;
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
				if(arr[j] == 0)
					zeros++;
				else if(arr[j] == 1)
					ones++;
				else
					twos++;
			}
			for(int j=0;j<n;j++){
				if(j < zeros)
					arr[j] = 0;
				else if(j < zeros+ones)
					arr[j] = 1;
				else
					arr[j] = 2;
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
