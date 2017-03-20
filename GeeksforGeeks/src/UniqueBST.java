import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class UniqueBST {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			System.out.println(getCatalan(2*n));
		}
	}
	//O(n^2) solution using dynamic programming
	static int getCatalanDP(int n){
		int[] catalan = new int[n+1];
		catalan[0] = catalan[1] = 1;
		
		for(int i=2;i<=n;i++){
			for(int j=0;j<i;j++){
				catalan[i] += catalan[j]*catalan[i-j-1];
			}
		}
		
		return catalan[n];
	}
	//O(n) solution using definition of Catalan numbers
	static int getCatalan(int n){
		int k = n/2;
		if(k > n-k){
			k = n-k;
		}
		int res = 1;
		for(int i=0;i<k;i++){
			res *= (n-i);
			res /= (i+1);
		}
		return res/(n/2+1);
	}
}
