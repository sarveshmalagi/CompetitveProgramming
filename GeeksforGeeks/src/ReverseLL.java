
/**
 * @author ssm
 *
 */
/* Return reference of new head of the reverse linked list 
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */

class ReverseLL
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverse(Node head)
   {
        Node p = null,q = head,r = head.next;
        
        while(q !=null){
            q.next = p;
            p = q;
            q = r;
            r = r!=null?r.next:null;
        }
        return p;
   }
}
