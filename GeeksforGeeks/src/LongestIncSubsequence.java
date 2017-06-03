import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */

/*1. If A[i] is smallest among all end 
candidates of active lists, we will start 
new active list of length 1.

2. If A[i] is largest among all end candidates of 
active lists, we will clone the largest active 
list, and extend it by A[i].


3. If A[i] is in between, we will find a list with 
largest end element that is smaller than A[i]. 
Clone and extend this list by A[i]. We will discard all
other lists of same length as that of this modified list.
*/


public class LongestIncSubsequence {
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
			int[] tail = new int[n];
			int len = 1;
			tail[0] = arr[0];
			
			for(int j=1;j<n;j++){
				if(arr[j] < tail[0]){
					tail[0] = arr[j];
				}
				else if(arr[j] > tail[len-1]){
					tail[len++] = arr[j];
				}
				else{
					tail[ceilIndex(tail,-1,len-1,arr[j])] = arr[j];
				}
			}
			System.out.println(len);
		}
	}
	
	static int ceilIndex(int A[], int l, int r, int key){
        while (r - l > 1){
            int m = l + (r - l)/2;
            if (A[m]>=key)
                r = m;
            else
                l = m;
        }
        return r;
    }
}