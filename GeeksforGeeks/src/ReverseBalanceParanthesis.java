import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author ssm
 *
 */
public class ReverseBalanceParanthesis {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t  = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String expr = br.readLine();
			Stack<Character> stack = new Stack<Character>();
			int reversals = 0;
			for(int j=0;j<expr.length();j++){
				char c = expr.charAt(j);
				if(c == '{'){
					stack.push(c);
				}
				else{
					if(!stack.isEmpty()){
						stack.pop();
					}
					else{
						stack.push('{');
						reversals++;
					}
				}
			}
			if(stack.size()%2 == 0){
				System.out.println(reversals+stack.size()/2);
			}
			else{
				System.out.println("-1");
			}
		}
	}
}
