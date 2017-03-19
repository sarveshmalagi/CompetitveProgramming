import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class LongestConsecSubsequence {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp_ip_arr = br.readLine().split(" ");
			int[] ip_arr = new int[n];
			for (int j = 0; j < n; j++) {
				ip_arr[j] = Integer.parseInt(temp_ip_arr[j]);
			}
			int[] hash = new int[501];
			for(int j=0;j<n;j++){
				hash[ip_arr[j]] = 1;
			}
			
			int maxLen = 0,len = 0;
			for(int j=0;j<501;j++){
				if(hash[j] != 0){
					len++;
				}
				else{
					if(len > maxLen)
						maxLen = len;
					len = 0;
				}
			}
			System.out.println(maxLen);
		}
	}
}
