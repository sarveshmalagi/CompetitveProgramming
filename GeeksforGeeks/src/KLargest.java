import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 * @author ssm
 *
 */
public class KLargest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] line1 = br.readLine().split(" ");
			int n = Integer.parseInt(line1[0]);
			int k = Integer.parseInt(line1[1]);
			String[] ip_arr = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(ip_arr[j]);
			}
			Comparator<Integer> comparator = new QComparator();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, comparator);
			for(int j=0;j<k;j++){
				pq.add(arr[j]);
			}
			for(int j=k;j<n;j++){
				if(pq.peek() < arr[j]){
					pq.remove();
					pq.add(arr[j]);
				}
			}
			ArrayList<Integer> ret_list = new ArrayList<Integer>();
			while(!pq.isEmpty()){
				//System.out.print(pq.remove()+" ");
				ret_list.add(pq.remove());
			}
			Collections.reverse(ret_list);
			for(int x : ret_list){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}

class QComparator implements Comparator<Integer>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0 < arg1){
			return -1;
		}
		else if(arg0 > arg1){
			return 1;
		}
		return 0;
	}
	
}
