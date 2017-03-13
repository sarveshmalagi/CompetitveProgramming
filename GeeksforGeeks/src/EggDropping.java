import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class EggDropping {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int k = Integer.parseInt(ip[1]);
			int[][] table = new int[n+1][k+1];
			int min = Integer.MAX_VALUE;;
			for(int l=1;l<=n;l++){
				for(int m=0;m<=k;m++){
					if(m == 0 || m == 1){
						table[l][m] = m;
					}
					else if(l == 1){
						table[l][m] = m;
					}
					else if(l == 0){
						table[l][m] = 0;
					}
					else{
						table[l][m] = Integer.MAX_VALUE;
						int tmp = 0;
						for(int x=1;x<=m;x++){
							tmp = 1+Integer.max(table[l-1][x-1], table[l][m-x]);
							if(tmp < table[l][m])
								table[l][m] = tmp;
						}
					}
					//System.out.print(table[l][m]+" ");
				}
				//System.out.println();
			}
			System.out.println(table[n][k]);	
		}
	}
}
