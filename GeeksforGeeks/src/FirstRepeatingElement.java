import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class FirstRepeatingElement {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int x : arr){
				if(hm.containsKey(x)){
					hm.put(x, hm.get(x)+1);
				}
				else{
					hm.put(x, 1);
				}
			}
			
			for(int j=0;j<n;j++){
				if(hm.get(arr[j]) > 1){
					System.out.println(j+1);
					continue outer;
				}
			}
			System.out.println("-1");
		}
	}
}
