import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class FacingSun {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] buildings = new int[n];
			for (int j = 0; j < n; j++) {
				buildings[j] = Integer.parseInt(temp[j]);
			}
			int currMax = buildings[0],count = 1;
			for(int j=1;j<n;j++){
				if(buildings[j] > currMax){
					currMax = buildings[j];
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
