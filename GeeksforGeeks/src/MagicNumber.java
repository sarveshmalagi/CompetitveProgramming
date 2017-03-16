import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class MagicNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] pattern  = new int[101];
		int exp = 0;
		for(int i=1;i<101;i++){
			if(i == (int)Math.pow(2,exp)){
				pattern[i] = (int)Math.pow(5,++exp);
			}
			else{
				pattern[i] = (int)Math.pow(5,exp)+pattern[i-(int)Math.pow(2,exp-1)];
			}
		}
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			System.out.println(pattern[n]);
		}
	}
}
