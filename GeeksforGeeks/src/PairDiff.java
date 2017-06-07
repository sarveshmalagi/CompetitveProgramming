import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class PairDiff {
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
			
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			int count = 0;
			for(int x : arr){
				if(hm.containsKey(x+k)){
					count += hm.get(x+k);
				}
				if(hm.containsKey(x-k)){
					count += hm.get(x-k);
				}
				if(hm.containsKey(x)){
					hm.put(x, hm.get(x)+1);
				}
				else{
					hm.put(x, 1);
				}
			}
			System.out.println(count);
		}
	}
}
