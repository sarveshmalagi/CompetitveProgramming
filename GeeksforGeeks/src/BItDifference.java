import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class BItDifference {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] ip = br.readLine().split(" ");
			int m = Integer.parseInt(ip[0]);
			int n = Integer.parseInt(ip[1]);
			
			int xnor = (m^n);
			int bitCount = 0;
			while(xnor > 0){
				xnor = xnor&(xnor-1);
				bitCount++;
			}
			System.out.println(bitCount);
		}
	}
}
