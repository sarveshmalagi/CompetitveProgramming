import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author ssm
 *
 */
public class HistogramArea {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			Stack<Integer> stack = new Stack<Integer>();
			int j = 0,maxArea = 0;
			while(j<n){
				if(stack.isEmpty() || arr[stack.peek()] < arr[j]){
					stack.push(j++);
				}
				else{
					int tp = stack.pop();
					int area = arr[tp]*(stack.isEmpty()?j:(j-stack.peek()-1));
					if(area > maxArea){
						maxArea = area;
					}
				}
			}
			
			while(!stack.empty()){
				int tp = stack.pop();
				int area = arr[tp]*(stack.isEmpty()?j:(j-stack.peek()-1));
				if(area > maxArea){
					maxArea = area;
				}
			}
			System.out.println(maxArea);
		}
	}
}
