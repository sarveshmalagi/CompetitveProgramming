import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/find-number-pairs-xy-yx/
public class NumPairs {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int m = Integer.parseInt(ip[1]);
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for (int j = 0; j < n; j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			String[] temp2 = br.readLine().split(" ");
			int[] arr2 = new int[m];
			for (int j = 0; j < m; j++) {
				arr2[j] = Integer.parseInt(temp2[j]);
			}
			
			Arrays.sort(arr2);
			countPairs(arr1,arr2,n,m);
		}
	}
	
	private static void countPairs(int[] arr1, int[] arr2, int n, int m) {
		int[] ex = new int[5];
		for(int j=0;j<m;j++){
			if(arr2[j] < 5){
				ex[arr2[j]]++;
			}
		}
		//printArray(ex);
		int nofpairs = 0;
		
		for(int j=0;j<n;j++){
			int temp = count(arr1[j],arr2,m,ex);
			nofpairs += temp;
			//System.out.println(temp);
		}
		System.out.println(nofpairs);
	}
	
	static int count(int x,int[] Y,int m,int[] ex){
			if(x == 0)
				return 0;
			if(x == 1)
				return ex[0];
			
			int ceil = ceilSearch(Y,0,m-1,x);
			//System.out.println("ceil "+ceil);
			int count = ceil!= -1?m-ceil:0;
			
			count += ex[0]+ex[1];
			
			if(x == 2)
				count -= (ex[3]+ex[4]);
			if(x == 3)
				count += ex[2];
			return count;
	}
	
	static int ceilSearch(int arr[], int low, int high, int x)
    {
      int mid;    
       
      /* If x is smaller than or equal to the 
         first element, then return the first element */
      if(x <= arr[low])
        return low; 
      
      /* If x is greater than the last 
         element, then return -1 */
      if(x > arr[high])
        return -1;  
      
      /* get the index of middle element 
         of arr[low..high]*/
      mid = (low + high)/2;  /* low + (high - low)/2 */
      
      /* If x is same as middle element, 
         then return mid */
      if(arr[mid] == x)
        return mid;
          
      /* If x is greater than arr[mid], then 
         either arr[mid + 1] is ceiling of x or 
         ceiling lies in arr[mid+1...high] */
      else if(arr[mid] < x)
      {
        if(mid + 1 <= high && x <= arr[mid+1])
          return mid + 1;
        else
          return ceilSearch(arr, mid+1, high, x);
      }
      
      /* If x is smaller than arr[mid], 
         then either arr[mid] is ceiling of x 
         or ceiling lies in arr[mid-1...high] */  
      else
      {
        if(mid - 1 >= low && x > arr[mid-1])
          return mid;
        else   
          return ceilSearch(arr, low, mid - 1, x);
      }
    }
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
