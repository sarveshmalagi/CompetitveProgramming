import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class RunningMedian {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Comparator<Integer> maxHeapComparator = new MaxHeapComparator();
		Comparator<Integer> minHeapComparator = new MinHeapComparator();
		
		Queue<Integer> maxHeap = new PriorityQueue<Integer>(n/2,maxHeapComparator);
		Queue<Integer> minHeap = new PriorityQueue<Integer>(n/2,minHeapComparator);
		
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = Integer.parseInt(br.readLine().trim());
		}
		
		int median = 0;
		
		for(int j=0;j<n;j++){
			if(maxHeap.size() == minHeap.size()){
				if(arr[j] < median){
					maxHeap.add(arr[j]);
					median = maxHeap.peek();
				}
				else{
					minHeap.add(arr[j]);
					median = minHeap.peek();
				}
			}
			else if(maxHeap.size() > minHeap.size()){
				if(arr[j] < median){
					minHeap.add(maxHeap.poll());
					maxHeap.add(arr[j]);
				}
				else{
					minHeap.add(arr[j]);
				}
				median = (maxHeap.peek()+minHeap.peek())/2;
			}
			else{
				if(arr[j] < median){
					maxHeap.add(arr[j]);
				}
				else{
					maxHeap.add(minHeap.poll());
					minHeap.add(arr[j]);
				}
				median = (maxHeap.peek()+minHeap.peek())/2;
			}
			System.out.println(median);
			//System.out.println(maxHeap+"\n"+minHeap+"\n\n");
		}
	}
}

class MaxHeapComparator implements Comparator<Integer> {
	  public int compare(Integer n1, Integer n2) {
	    return (n2>n1?1:n2<n1?-1:0);
	  }
}

class MinHeapComparator implements Comparator<Integer> {
	  public int compare(Integer n1, Integer n2) {
	    return (n1>n2?1:n1<n2?-1:0);
	  }
}