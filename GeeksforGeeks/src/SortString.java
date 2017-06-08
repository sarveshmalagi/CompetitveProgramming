import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class SortString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			char[] ip = br.readLine().toCharArray();
			countSort(ip,n);
			String res = new String(ip);
			System.out.println(res);
		}
	}
	
	static void countSort(char[] ip,int n){
		int[] count = new int[256];
		
		for(int i=0;i<n;i++){
			count[ip[i]]++;
		}
		
		for(int i=1;i<256;i++){
			count[i] += count[i-1];
		}
		
		char[] sorted = new char[n];
		for(int i=0;i<n;i++){
			sorted[count[ip[i]]-1] = ip[i];
			count[ip[i]]--;
		}
		for(int i=0;i<n;i++){
			ip[i] = sorted[i];
		}
	}
}
