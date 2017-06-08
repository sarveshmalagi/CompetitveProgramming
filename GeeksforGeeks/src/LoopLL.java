
/**
 * @author ssm
 *
 */
/* Node is defined as 
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
//try out the hashing approach
//slow.next != null  condition redundant?
public class LoopLL {
	int detectLoop(Node head){
		Node slow = head,fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				return 1;
			}
		}
		return 0;
	}
}
