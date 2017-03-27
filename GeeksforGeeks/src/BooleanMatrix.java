import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
public class BooleanMatrix {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] dimens = br.readLine().split(" ");
			int r = Integer.parseInt(dimens[0]);
			int c = Integer.parseInt(dimens[1]);
			String[] ip = br.readLine().split(" ");
			int[][] matrix = new int[r][c];
			int count = 0;
			HashSet<Integer> rows = new HashSet<Integer>();
			HashSet<Integer> cols = new HashSet<Integer>();
			for(int j=0;j<r;j++){
				for(int k=0;k<c;k++){
					matrix[j][k] = Integer.parseInt(ip[count++]);
					if(matrix[j][k] == 1){
						rows.add(j);
						cols.add(k);
					}
				}
			}
			for(int j=0;j<r;j++){
				for(int k=0;k<c;k++){
					if(matrix[j][k] == 1){
						System.out.print("1 ");
					}
					else{
						if(rows.contains(j) || cols.contains(k)){
							System.out.print("1 ");
						}
						else{
							System.out.print("0 ");
						}
					}
				}
			}
			System.out.println();
		}
	}
}
