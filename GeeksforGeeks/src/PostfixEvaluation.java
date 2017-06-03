import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author ssm
 *
 */
public class PostfixEvaluation {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String expr = br.readLine();
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int j=0;j<expr.length();j++){
				char c = expr.charAt(j);
				if(Character.isDigit(c)){
					stack.push(c-'0');
				}
				else{
					if(!stack.isEmpty()){
						int op1 = stack.pop();
						int op2 = stack.pop();
						
						int res = 0;
						if(c == '+')
							res = op1+op2;
						else if(c == '-')
							res = op2-op1;
						else if(c == '*')
							res = op2*op1;
						else
							res = op2/op1;
						stack.push(res);
					}
				}
			}
			System.out.println(stack.pop());
		}
	}
}
