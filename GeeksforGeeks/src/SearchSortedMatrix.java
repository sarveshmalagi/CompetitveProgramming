import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class SearchSortedMatrix {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] dimens = br.readLine().split(" ");
			int m = Integer.parseInt(dimens[0]);
			int n = Integer.parseInt(dimens[1]);
			
			String[] ip = br.readLine().split(" ");
			int key = Integer.parseInt(br.readLine());
			int[][] matrix = new int[m][n];
			int count = 0;
			
			for(int j=0;j<m;j++){
				for(int k=0;k<n;k++){
					matrix[j][k] = Integer.parseInt(ip[count++]);
				}
			}
			
			int j = 0,k = n-1;
			while(true){
				if(j > m-1 || j < 0 || k > n-1 || k < 0)
					break;
				
				if(matrix[j][k] == key)
					break;
				
				if(matrix[j][k] < key)
					j++;
				
				else if(matrix[j][k] > key)
					k--;
			}
			
			if(j > m-1 || j < 0 || k > n-1 || k < 0){
				System.out.println("0");
			}
			else{
				System.out.println("1");
			}
		}
	}
}
