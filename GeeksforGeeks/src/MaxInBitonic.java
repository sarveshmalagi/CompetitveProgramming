import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
//will O(lgn) perform better than O(n) in this case?
//i/p time will be O(n)
public class MaxInBitonic {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp_ip_arr = br.readLine().split(" ");
			int[] ip_arr = new int[n];
			for (int j = 0; j < n; j++) {
				ip_arr[j] = Integer.parseInt(temp_ip_arr[j]);
			}
			int maxIndex = binarySearchMax(ip_arr);
			System.out.println(ip_arr[maxIndex]);
		}
	}
	
	static int binarySearchMax(int[] ip_arr){
		int low = 0,high = ip_arr.length-1;
		int mid = (low+high)/2;
		while(low <= high){
			mid = (low+high)/2;
			if(ip_arr[mid] > ip_arr[mid+1] && ip_arr[mid] > ip_arr[mid-1]){
				return mid;
			}
			else if(ip_arr[mid] > ip_arr[mid+1]){
				high = mid-1;
			}
			else{
				low = mid+1;
			}
		}
		return mid;
	}
}
