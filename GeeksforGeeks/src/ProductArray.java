import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class ProductArray {
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
			long[] forwardProduct = new long[n];
			long[] backwardProduct = new long[n];
			forwardProduct[0] = arr[0];
			for(int j=1;j<n;j++){
				forwardProduct[j] = arr[j]*forwardProduct[j-1];
			}
			backwardProduct[n-1] = arr[n-1];
			for(int j=n-2;j>=0;j--){
				backwardProduct[j] = arr[j]*backwardProduct[j+1];
			}
			
			long[] product = new long[n];
			for(int j=1;j<n-1;j++){
				product[j] = forwardProduct[j-1]*backwardProduct[j+1];
			}
			product[0] = backwardProduct[1];
			product[n-1] = forwardProduct[n-2];
			//printArray(forwardProduct);
			//printArray(backwardProduct);
			printArray(product);
		}
	}
	
	static void printArray(long[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
