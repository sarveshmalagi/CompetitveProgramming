import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class SubarraySum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int sum = Integer.parseInt(ip[1]);
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			int start = 0,currSum = arr[0],end = 0;
			for(int j=1;j<=n;j++){
				while(currSum > sum && start < j-1){
					currSum -= arr[start];
					start++;
				}
				if(currSum == sum){
					end = j;
					break;
				}
				if(j < n){
					currSum += arr[j];
				}
			}
			System.out.println(end==0?"-1":(start+1)+" "+end);
		}
	}
	//More intuitive solution
	/*static void printSubarrayWithGivenSum(int[] arr,int sum) {
		int n = arr.length;
		int start = 0;
		int currSum = 0;
 
		for(int i=0;i<n;i++) {
			currSum += arr[i];
 
			while(currSum>sum && start<i) {
				currSum -= arr[start];
				start++;
			}
 
			if(currSum == sum) {
				System.out.println("SubArray with sum " + sum + " found from " + start + " to " + i);
				SubarrayWithGivenSum.printArray(arr,start,i);
				return;
			}			
		}
 
		System.out.println("No subarray with sum " + sum + " found");
	}*/
}
