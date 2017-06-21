import java.util.Stack;

/**
 * @author ssm
 *
 */
public class SpiralLevelOrder {
	void printSpiral(NodeBST NodeBST) {
	        Stack<NodeBST> stack1 = new Stack<NodeBST>();
	        Stack<NodeBST> stack2 = new Stack<NodeBST>();
	        
	        stack1.push(NodeBST);
	        
	        while(!stack1.isEmpty() || !stack2.isEmpty()){
	            
	            while(!stack1.isEmpty()){
	                NodeBST popped = stack1.pop();
	                System.out.print(popped.data+" ");
	                
	                if(popped.right != null)
	                    stack2.push(popped.right);
	                if(popped.left != null)
	                    stack2.push(popped.left);
	            }
	            
	            while(!stack2.isEmpty()){
	                NodeBST popped = stack2.pop();
	                System.out.print(popped.data+" ");
	                
	                if(popped.left != null)
	                    stack1.push(popped.left);
	                if(popped.right != null)
	                    stack1.push(popped.right);
	            }
	        }
	    }
}
