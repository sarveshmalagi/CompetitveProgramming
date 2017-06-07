import java.util.Stack;

/**
 * @author ssm
 *
 */


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class PalindromeLL
{
    boolean isPalindrome(Node head) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        Node itr = head;
        
        while(itr != null){
            stack.push(itr.data);
            itr = itr.next;
        }
        itr = head;
        while(!stack.isEmpty()){
            if(stack.pop() != itr.data){
                return false;
            }
            else{
                itr = itr.next;
            }
        }
        return true;
    }    
}
