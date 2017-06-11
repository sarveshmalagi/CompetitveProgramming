import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/merge-k-sorted-arrays/
public class MergeKSortedArray {
	
	public static void main(String[] args) {
		int[][] arrays = { {1, 3, 5},
				{2, 4, 6},
				{0, 9, 10}} ;
		System.out.println(mergeKArrays(arrays,3));
	}
	
	public static ArrayList<Integer> mergeKArrays(int[][] arrays,int k){
	        Comparator<PQ> comparator = new PQComparator();
	        PriorityQueue<PQ> pq = new PriorityQueue<PQ>(k,comparator);
	        ArrayList<Integer> resList = new ArrayList<Integer>();
	        
	        int[] index = new int[k];
	        for(int i=0;i<k;i++){
		            pq.add(new PQ(arrays[i][0],i));
		            //System.out.println("Adding "+arrays[i][0]);
		            index[i]++;
		}
	        
	        for(int i=0;i<k*k;i++){
	            PQ min = pq.poll();
	            //System.out.println("removing "+min.val);
	            resList.add(min.val);
	            int minIndex = index[min.index];
	            printArray(index);
	            if(minIndex < k){
	        	    pq.add(new PQ(arrays[min.index][minIndex],min.index));
	        	    //System.out.println("Adding "+arrays[min.index][minIndex]);
	            }
	            else{
	        	    pq.add(new PQ(Integer.MAX_VALUE,min.index));
	            }
	            index[min.index]++;
	        }
	        return resList;
	    }
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

	class PQ{
	    int val,index;
	    
	    public PQ(int val,int index){
	        this.val = val;
	        this.index = index;
	    }
}

class PQComparator implements Comparator<PQ>{  
    public int compare(PQ s1,PQ s2){  
        if(s1.val==s2.val)  
            return 0;  
        else if(s1.val>s2.val)  
            return 1;  
        else  
            return -1;  
    }  
}