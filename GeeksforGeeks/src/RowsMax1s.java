import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class RowsMax1s {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++){
			String[] temp1 = br.readLine().trim().split(" ");
			int n = Integer.parseInt(temp1[0]);
			int m = Integer.parseInt(temp1[1]);
			String[] ip = br.readLine().split(" ");
            int[][] matrix = new int[n][m];
            int count1 = 0;
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    matrix[j][k] = Integer.parseInt(ip[count1++]);
                }
            }
            int count = 0,maxCount = 0,index = 0;
            for(int j=0;j<n;j++){
                for(int k=0;k<m;k++){
                    if(matrix[j][k] == 1){
                        count++;
                    }
                }
                if(count > maxCount){
                    maxCount = count;
                    index = j;
                }
                count = 0;
            }
			System.out.println(index);
		}
	}
}
