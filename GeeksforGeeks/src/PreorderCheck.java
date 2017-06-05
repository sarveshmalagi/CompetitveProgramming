import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/check-if-a-given-array-can-represent-preorder-traversal-of-binary-search-tree/
//problem with input(NFException)
public class PreorderCheck {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			Stack<Integer> stack = new Stack<Integer>();
			int root = -1;
			for(int j=0;j<n;j++){
				if(arr[j] < root){
					System.out.println("0");
					continue outer;
				}
				
				while(!stack.isEmpty() && arr[j] > stack.peek()){
					root = stack.pop();
				}
				
				stack.push(arr[j]);
			}
			System.out.println("1");
		}
	}
}
