import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class ReducedArr {
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
			int[] aux = new int[n];
			for(int j=0;j<n;j++){
				aux[j] = arr[j];
			}
			Arrays.sort(aux);
			//printArray(aux);
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int j=0;j<n;j++){
				hm.put(aux[j],j);
			}
			for(int j=0;j<n;j++){
				arr[j] = hm.get(arr[j]);
			}
			printArray(arr);
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
