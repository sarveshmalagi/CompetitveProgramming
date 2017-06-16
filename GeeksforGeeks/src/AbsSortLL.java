
/**
 * @author ssm
 *
 */
public class AbsSortLL {
	Node sortedList(Node head){
		    Node itr = head;
		    
		    while(itr != null && itr.next != null){
		        if(itr.next.data < 0){
		            Node temp = itr.next;
		            itr.next = itr.next.next;
		            temp.next = head;
		            head = temp;
		        }
		        else{
		            itr = itr.next;
		        }
		    }
		    return head;
		}
}
