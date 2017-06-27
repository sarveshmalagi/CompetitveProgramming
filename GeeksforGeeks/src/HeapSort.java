
/**
 * @author ssm
 *
 */
public class HeapSort {
	void buildHeap(int arr[], int n){
	        int start = arr.length/2;
	        
	        for(int i=start;i>=0;i--){
	            heapify(arr,n,i);
	        }
	    }
	 
	    // To heapify a subtree rooted with node i which is
	    // an index in arr[]. n is size of heap
	    void heapify(int arr[], int n, int i){
	        int l = left(arr,i);
	        int r = right(arr,i);
	        int max = i;
	        
	        if(l < arr.length && arr[i] < arr[l])
	            max = l;
	        if(r < arr.length && arr[max] < arr[r])
	            max = r;
	            
	        if(max != i){
	            int temp = arr[i];
	            arr[i] = arr[max];
	            arr[max] = temp;
	            
	            heapify(arr,n,max);
	        }
	    }
	    
	    int left(int[] arr,int i){
	        return 2*i+1;
	    }
	    
	    int right(int[] arr,int i){
	        return 2*i+2;
	    }
}
