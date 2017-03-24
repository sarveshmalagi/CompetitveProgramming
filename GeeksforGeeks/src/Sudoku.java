import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class Sudoku {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] ip = br.readLine().split(" ");
			int[][] grid = new int[9][9];
			int count = 0;
			for(int j=0;j<9;j++){
				for(int k=0;k<9;k++){
					grid[j][k] = Integer.parseInt(ip[count++]);
				}
			}
			System.out.println(checkValid(grid));
		}
	}
	
	static int checkValid(int[][] grid){
		for(int i=0;i<9;i++){
			boolean[] check = new boolean[10];
			for(int j=0;j<9;j++){
				if(grid[i][j] != 0 && check[grid[i][j]]){
					return 0;
				}
				else{
					check[grid[i][j]] = true;
				}
			}
		}
		
		for(int i=0;i<9;i++){
			boolean[] check = new boolean[10];
			for(int j=0;j<9;j++){
				if(grid[j][i] != 0 && check[grid[j][i]]){
					return 0;
				}
				else{
					check[grid[j][i]] = true;
				}
			}
		}
		
		for(int bl=0;bl<9;bl++){
			boolean[] check = new boolean[10];
			for(int i=bl/3*3;i<bl/3*3+3;i++){
				for(int j=bl%3*3;j<bl%3*3+3;j++){
					if(grid[i][j] != 0 && check[grid[i][j]]){
						return 0;
					}
					check[grid[i][j]] = true;
				}
			}
		}
		return 1;
	}
}
