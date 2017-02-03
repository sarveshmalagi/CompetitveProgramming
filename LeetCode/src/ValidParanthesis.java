import java.util.Stack;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/valid-parentheses/
//check the possible inputs
public class ValidParanthesis {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if(!stack.empty()){
                    char top = stack.pop();
                    if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                        return false;
                    }   
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
