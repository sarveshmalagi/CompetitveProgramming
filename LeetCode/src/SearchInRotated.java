import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class SearchInRotated {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			int key = Integer.parseInt(br.readLine());
			System.out.println(binarySearch(arr,0,n-1,key));
		}
	}
	
	static int binarySearch(int[] arr,int l,int h,int key){
		if(l > h){
			return -1;
		}
		int mid = (l+h)/2;
		if(arr[mid] == key){
			return mid;
		}
		
		if(arr[l] <= arr[mid]){
			if(key >= arr[l] && key <= arr[mid]){
				return binarySearch(arr,l,mid-1,key);	
			}
			else{
				return binarySearch(arr,mid+1,h,key);
			}
		}
		
		if(key >= arr[mid] && key <= arr[h]){
			return binarySearch(arr,mid+1,h,key);
		}
		else{
			return binarySearch(arr,l,mid-1,key);
		}
	}
}
