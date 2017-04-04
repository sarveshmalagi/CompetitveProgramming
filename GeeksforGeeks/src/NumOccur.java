import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
//try to do it in 2*logn(2 calls to binarySearch)
//index of last occurrence - index of first occurrence + 1
public class NumOccur {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] temp = br.readLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int x = Integer.parseInt(temp[1]);
			String[] ip = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(ip[j]);
			}
			int index = binarySearch(arr,n,x);
			if(index != -1){
				int count = 1,k=index-1;
				while(k >= 0 && arr[k] == x){
					count++;
					k--;
				}
				k = index+1;
				while(k < n && arr[k] == x){
					count++;
					k++;
				}
				System.out.println(count);
			}
			else{
				System.out.println(index);
			}
		}
	}

	private static int binarySearch(int[] arr, int n, int x) {
		int low = 0,high = n-1,mid = low+(high-low)/2;
		
		while(low <= high){
			mid = low+(high-low)/2;
			if(arr[mid] == x){
				return mid;
			}
			else if(arr[mid] < x){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return -1;
	}
}
