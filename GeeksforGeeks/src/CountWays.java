import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class CountWays {
	static int ways;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] ip = br.readLine().split(" ");
			int m = Integer.parseInt(ip[0]);
			int n = Integer.parseInt(ip[1]);
			ways = 0;
			countWays(0,0,m,n);
			System.out.println(ways!=0?ways:1);
		}
	}
	
	static void countWays(int x,int y,int m,int n){
		if(x == m-1 && y == n-1){
			ways++;
			return;
		}
		else{
			if(x+1 < m){
				countWays(x+1,y,m,n);
			}
			if(y+1 < n){
				countWays(x,y+1,m,n);
			}
		}
		return;
	}
}
