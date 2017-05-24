import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class FindDupicates {
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
			boolean unique = true;
			for(int j=0;j<n;j++){
				if(arr[Math.abs(arr[j])] >= 0)
					arr[Math.abs(arr[j])] = -1*arr[Math.abs(arr[j])];
				else{
					unique = false;
					System.out.print(Math.abs(arr[j])+" ");
				}
			}
			if(unique){
				System.out.print("-1");
			}
			System.out.println();
		}
		
		/*for(int i=0;i<n;i++){
                arr[arr[i]%n] += n;
            }
            for(int i=0;i<n;i++){
                if(arr[i]/n > 1){
                    System.out.print(i+" ");
                }
            }*/
	}
}
