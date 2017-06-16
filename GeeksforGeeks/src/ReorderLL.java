
/**
 * @author ssm
 *
 */
/* Following is the Linked list node structure */
/*class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
	
class ReorderLL
{
    Node reorderlist(Node head){
        Node slow = head,fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node head1 = head,head2 = slow.next;
        slow.next = null;
        
        head2 = reverseList(head2);
        
        Node newHead = new Node(0);
        Node itr = newHead;
        while(head1 != null || head2 != null){
            if(head1 != null){
                itr.next = head1;
                head1 = head1.next;
                itr = itr.next;
            }
            if(head2 != null){
                itr.next = head2;
                head2 = head2.next;
                itr = itr.next;
            }
        }
        return newHead.next;
    }
    Node reverseList(Node node) {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
}

