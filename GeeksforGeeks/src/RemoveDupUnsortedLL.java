import java.util.HashSet;

/**
 * @author ssm
 *
 */
/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class RemoveDupUnsortedLL
{
    Node removeDuplicates(Node head)
    {
        HashSet<Integer> hs = new HashSet<Integer>();
        Node itr = head;
        hs.add(head.data);
        
        while(itr.next != null){
            if(hs.contains(itr.next.data)){
                itr.next = itr.next.next;
            }
            else{
                hs.add(itr.next.data);
                itr = itr.next;
            }
        }
        return head;
    }
}

