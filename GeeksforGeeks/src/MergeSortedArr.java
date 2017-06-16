import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MergeSortedArr {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int m = Integer.parseInt(ip[1]);
			
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for (int j = 0; j < n; j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			
			String[] temp2 = br.readLine().split(" ");
			int[] arr2 = new int[m];
			for (int j = 0; j < m; j++) {
				arr2[j] = Integer.parseInt(temp2[j]);
			}
			
			for(int j=m-1;j>=0;j--){
				int k,last = arr1[n-1];
				for(k=n-2;k>=0 && arr1[k] > arr2[j];k--){
					arr1[k+1] = arr1[k];
				}
				if(k != n-2 || last > arr2[j]){
					arr1[k+1] = arr2[j];
					arr2[j] = last;
				}
			}
			printArray(arr1);
			printArray(arr2);
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
