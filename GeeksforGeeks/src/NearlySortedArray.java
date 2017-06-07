import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * @author ssm
 *
 */
public class NearlySortedArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int k = Integer.parseInt(ip[1]);
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int j=0;j<k+1 && j<n;j++){
				pq.add(arr[j]);
			}
			
			for(int j=k+1,ti = 0;ti<n;ti++,j++){
				if(j < n){
					arr[ti] = pq.poll();
					pq.add(arr[j]);
				}
				else{
					arr[ti] = pq.poll();
				}
			}
			//simple but more time consuming approach
			/*int ptr = 0;
			while(ptr <= n-k){
				for(int j=0;j<k;j++){
					pq.add(arr[ptr+j]);
				}
				for(int j=0;j<k;j++){
					arr[ptr+j] = pq.poll();
				}
				ptr += k;
			}*/
			printArray(arr);
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
