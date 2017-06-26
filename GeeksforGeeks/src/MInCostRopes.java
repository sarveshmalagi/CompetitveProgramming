import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * @author ssm
 *
 */
public class MInCostRopes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			int cost = 0;
			
			for(int j=0;j<n;j++){
				pq.add(arr[j]);
			}
			
			while(pq.size() >= 2){
				//System.out.println(pq);
				int rope1 = pq.poll();
				int rope2 = pq.poll();
				
				//System.out.println(rope1+" "+rope2);
				cost += rope1+rope2;
				
				pq.add(rope1+rope2);
			}
			System.out.println(cost);
		}
	}
}
