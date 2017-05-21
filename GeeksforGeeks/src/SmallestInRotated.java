import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class SmallestInRotated {
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
			System.out.println(binarySearch(arr,0,n-1)-1);
		}
	}
	
	static int binarySearch(int[] arr,int l,int h){
		if(h < l)
			return -1;
		int mid = (l+h)/2;
		if(arr[mid] < arr[mid-1])
			return mid;
		else if(arr[mid] >= arr[l])
			return binarySearch(arr,mid+1,h);
		else
			return binarySearch(arr,l,mid-1);
	}
}
