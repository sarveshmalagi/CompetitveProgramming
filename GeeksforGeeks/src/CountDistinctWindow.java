import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class CountDistinctWindow {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] temp = br.readLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int k = Integer.parseInt(temp[1]);
			String[] ip = br.readLine().split(" ");
			int[] arr = new int[n];
			for(int j=0;j<n;j++){
				arr[j] = Integer.parseInt(ip[j]);
			}
			HashMap<Integer,Integer> hm  = new HashMap<Integer,Integer>();
			for(int j=0;j<k;j++){
				if(hm.containsKey(arr[j])){
					hm.put(arr[j], hm.get(arr[j])+1);
				}
				else{
					hm.put(arr[j], 1);
				}
			}
			System.out.print(hm.size()+" ");
			for(int j=k;j<n;j++){
				if(hm.get(arr[j-k]) == 1){
					hm.remove(arr[j-k]);
				}
				else{
					hm.put(arr[j-k], hm.get(arr[j-k])-1);
				}
				
				if(hm.containsKey(arr[j])){
					hm.put(arr[j],hm.get(arr[j])+1);
				}
				else{
					hm.put(arr[j], 1);
				}
				System.out.print(hm.size()+" ");
			}
			System.out.println();
		}
	}
}
