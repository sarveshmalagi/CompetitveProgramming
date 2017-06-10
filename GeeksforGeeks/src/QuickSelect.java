import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class QuickSelect {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			int k = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			System.out.println(kthsmallest(arr,0,n-1,k));
			//printArray(arr);
		}
		
	}
	
	// IN ARR[] ARE DISTINCT
	    static int kthsmallest(int arr[], int l, int r, int k)
	    {
	        // If k is smaller than number of elements in array
	        if (k > 0 && k <= r - l + 1)
	        {
	            // Partition the array around a random element and
	            // get position of pivot element in sorted array
	            int pos = rpivot(arr, l, r);
	 
	            // If position is same as k
	            if (pos-l == k-1)
	                return arr[pos];
	 
	            // If position is more, recur for left subarray
	            if (pos-l > k-1)
	                return kthsmallest(arr, l, pos-1, k);
	 
	            // Else recur for right subarray
	            return kthsmallest(arr, pos+1, r, k-pos+l-1);
	        }
	 
	        // If k is more than number of elements in array
	        return Integer.MAX_VALUE;
	    }
	
	static int partition(int arr[],int l,int h){
		int i,temp,j;
		int pivot = arr[h];
		i = l-1;
		for(j=l;j<h;j++){
			if(arr[j] <= pivot){
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] = temp;
		return i+1;
	}

	static int rpivot(int a[],int l,int h){
		int temp;
		int pivot_index = l+(int)Math.random()%(h-l+1);
		int pivot = a[pivot_index];
		temp = a[h];
		a[h] = a[pivot_index];
		a[pivot_index] = temp;
		//System.out.println(pivot);
		return partition(a,l,h);
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
