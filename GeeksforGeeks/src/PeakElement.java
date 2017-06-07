import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class PeakElement {
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
			
			System.out.println(binarySearch(arr,0,n-1));
		}
	}
	
	static int binarySearch(int[] arr,int l,int h){
		int mid = l+(h-l)/2;
		while(l <= h){
			mid = l+(h-l)/2;
			//System.out.println("mid "+mid);
			if((mid == 0 || arr[mid-1] <= arr[mid]) &&
		            (mid == arr.length-1 || arr[mid+1] <= arr[mid])){
				return mid;
			}
			else if(mid > 0 && arr[mid-1] > arr[mid]){
				h = mid-1;
			}
			else{
				l = mid+1;
			}
		}
		return -1;
	}
}
