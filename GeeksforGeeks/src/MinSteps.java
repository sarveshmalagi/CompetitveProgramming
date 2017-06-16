import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MinSteps {
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
			int stepCount = 0;
			while(true){
				int zeroCount = 0,evenCount = 0;
				
				for(int j=0;j<n;j++){
					if(arr[j] == 0){
						zeroCount++;
					}
					if(arr[j]%2 == 0){
						evenCount++;
					}
				}

				if(zeroCount == n){
					System.out.println(stepCount);
					break;
				}
				
				if(evenCount == n){
					for(int j=0;j<n;j++){
						arr[j] /= 2;
					}
					stepCount++;
				}
				
				for(int j=0;j<n;j++){
					if(arr[j]%2 == 1){
						arr[j]--;
						stepCount++;
					}
				}
				//printArray(arr);
			}
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
