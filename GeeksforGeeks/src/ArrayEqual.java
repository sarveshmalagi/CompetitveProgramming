import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class ArrayEqual {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for (int j=0; j<n;j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			String[] temp2 = br.readLine().split(" ");
			int[] arr2 = new int[n];
			for(int j=0;j<n;j++){
				arr2[j] = Integer.parseInt(temp2[j]);
			}
			
			HashMap<Integer,Integer> hm1 = new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> hm2 = new HashMap<Integer,Integer>();
			
			for(int j=0;j<n;j++){
				if(!hm1.containsKey(arr1[j])){
					hm1.put(arr1[j],1);
				}
				else{
					hm1.put(arr1[j],hm1.get(arr1[j])+1);
				}
			}
			
			for(int j=0;j<n;j++){
				if(!hm2.containsKey(arr2[j])){
					hm2.put(arr2[j],1);
				}
				else{
					hm2.put(arr2[j],hm1.get(arr2[j])+1);
				}
			}
			
			if(hm1.equals(hm2)){
				System.out.println("1");
			}
			else{
				System.out.println("0");
			}
		}
	}
}
