import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class XTotalShapes {
	static char[][] grid;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] temp = br.readLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);
			grid = new char[n][m];
			String[] ip = br.readLine().split(" ");
			for(int j=0;j<n;j++){
				for(int k=0;k<m;k++){
					grid[j][k] = ip[j].charAt(k);
				}
			}
			int count = 0;
			for(int j=0;j<n;j++){
				for(int k=0;k<m;k++){
					if(grid[j][k] == 'X'){
						modBFS(grid,n,m,j,k);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	
	static void modBFS(char[][] grid,int n,int m,int x,int y){
		Queue<Pair> queue = new LinkedList<Pair>();
		queue.add(new Pair(x,y));
		while(!queue.isEmpty()){
			Pair p = queue.remove();
			grid[p.x][p.y] = '1';
			if(p.x < n-1 && grid[p.x+1][p.y] == 'X')
				queue.add(new Pair(p.x+1,p.y));
			if(p.y < m-1 && grid[p.x][p.y+1] == 'X')
				queue.add(new Pair(p.x,p.y+1));
			if(p.x > 0 && grid[p.x-1][p.y] == 'X')
				queue.add(new Pair(p.x-1,p.y));
			if(p.y > 0 && grid[p.x][p.y-1] == 'X')
				queue.add(new Pair(p.x,p.y-1));	
		}
	}
}

class Pair{
	int x,y;
	
	public Pair(int x,int y){
		this.x = x;
		this.y = y;
	}
}