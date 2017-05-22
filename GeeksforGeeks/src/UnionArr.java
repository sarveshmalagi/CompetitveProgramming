import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class UnionArr {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] temp = br.readLine().split(" ");
			int m = Integer.parseInt(temp[0]);
			int n = Integer.parseInt(temp[1]);
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[m];
			for (int j = 0; j < m; j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			String[] temp2 = br.readLine().split(" ");
			int[] arr2 = new int[n];
			for(int j=0;j<n;j++){
				arr2[j] = Integer.parseInt(temp2[j]);
			}
			Arrays.sort(arr1);	//Hence O(nlogn) for unsorted arrays and O(n) for sorted arrays
			Arrays.sort(arr2);
			int k = 0,l = 0,p = 0,prev = 0;
			while(k < m && l < n){
				if(arr1[k] < arr2[l]){
					if(arr1[k] != prev){
						System.out.print(arr1[k]+" ");
						prev = arr1[k];
						k++;
					}
					else{
						k++;
					}
				}
				else{
					if(arr2[l] != prev){
						System.out.print(arr2[l]+" ");
						prev = arr2[l];
						l++;
					}
					else{
						l++;
					}
				}
			}
			
			while(k < m){
				if(arr1[k] != prev){				//Handle duplicates
					System.out.print(arr1[k]+" ");
					prev = arr1[k];
					k++;
				}
				else{
					k++;
				}
			}
			
			while(l < n){
				if(arr2[l] != prev){
					System.out.print(arr2[l]+" ");
					prev = arr2[l];
					l++;
				}
				else{
					l++;
				}
			}
			System.out.println();
		}
	}
}
