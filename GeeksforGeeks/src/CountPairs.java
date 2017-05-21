import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class CountPairs {
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
			int count = mergesort(arr,0,n-1);
			/*for(int j=0;j<n;j++){
				System.out.print(arr[j]+" ");
			}*/
			System.out.println(count);
		}
	}
	
	static int mergesort(int[] arr,int l,int h){
		int count = 0;
		if(l < h){
			int mid = (l+h)/2;
			count = mergesort(arr,l,mid);
			count += mergesort(arr,mid+1,h);
			count += merge(arr,l,mid,h);
		}
		return count;
	}
	
	static int merge(int arr[], int l, int m, int r)
    {
		int count = 0;
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
                count += m-i;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        
        return count;
    }
}
