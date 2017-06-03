import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author ssm
 *
 */
public class StockSpan {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(0);
			int[] span = new int[n];
			span[0] = 1;
			
			for(int j=1;j<n;j++){
				while(!stack.empty() && arr[stack.peek()] < arr[j]){
					stack.pop();
				}
				span[j] = stack.isEmpty()?j+1:j-stack.peek();
				stack.push(j);
			}
			printArray(span);
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
