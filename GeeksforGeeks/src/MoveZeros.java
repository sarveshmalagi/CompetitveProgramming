import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MoveZeros {
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
			int count = 0;
			for(int j=0;j<n;j++){
				if(arr[j] != 0)
					arr[count++] = arr[j];
			}
			for(int j=count;j<n;j++){
				arr[j] = 0;
			}
			for(int j=0;j<n;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
	}
}
