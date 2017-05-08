import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ssm
 *
 */
public class TripleZeroSum{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for (int j=0; j<n;j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			
			HashSet<Integer> set =  new HashSet<Integer>();
			for(int j=0;j<n;j++){
				set.add(arr1[j]);
			}
			boolean flag = false;
			outer : for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(j != k){
						int twoSum = arr1[j]+arr1[k];
						set.remove(arr1[j]);
						set.remove(arr1[k]);
						if(set.contains(-1*twoSum)){
							flag = true;
							System.out.println("1");
							System.out.println(arr1[j]+" "+arr1[k]+" "+-1*twoSum);
							break outer;
						}
						set.add(arr1[j]);
						set.add(arr1[k]);
					}
				}
			}
			if(flag == false){
				System.out.println("0");
			}
		}
	}
}
