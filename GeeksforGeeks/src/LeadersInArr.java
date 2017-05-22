import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author ssm
 *
 */
public class LeadersInArr {
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
			ArrayList<Integer> resList = new ArrayList<Integer>();
			StringBuilder res = new StringBuilder();
			int max = arr[n-1];
			resList.add(arr[n-1]);
			for(int j=n-1;j>=0;j--){
				if(arr[j] > max){
					resList.add(arr[j]);
					max = arr[j];
				}
			}
			Collections.reverse(resList);
			for(int x : resList){
				res.append(x+" ");
			}
			System.out.println(res);
		}
	}
}
