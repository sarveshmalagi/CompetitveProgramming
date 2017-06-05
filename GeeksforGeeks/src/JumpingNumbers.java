import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class JumpingNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			printJumping(n);
			System.out.println();
		}
	}
	
	static void printJumping(int n){
		System.out.print("0 ");
		for(int i=1;i<n && i <= 9;i++){
			bfs(i,n);
		}
	}
	
	static void bfs(int num,int x){
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(num);
		
		while(!queue.isEmpty()){
			int n = queue.poll();
			
			if(n <= x){
				System.out.print(n+" ");
				int digit = n%10;
				
				if(digit == 0){
					queue.add((n*10)+digit+1);
				}
				else if(digit == 9){
					queue.add((n*10)+digit-1);
				}
				else{
					queue.add((n*10)+digit-1);
					queue.add((n*10)+digit+1);
				}
			}
		}
	}
}
