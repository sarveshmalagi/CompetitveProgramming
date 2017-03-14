import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
//Try to do it in O(logn)
public class CountSetBits {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			int[] count = new int[1001];
			count[0] = 0;
			count[1] = 1;
			int power = 2;
			for(int j=2;j<=n;j++){
				if(j == power*2){
					power *= 2;
				}
				count[j] = count[j-power]+1;
			}
			int sum = 0;
			for(int j=0;j<1001;j++){
				sum += count[j];
			}
			System.out.println(sum);
		}
	}
}
