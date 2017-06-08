
/**
 * @author ssm
 *
 */
/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class NthFromLastLL
{
    int getNthFromLast(Node head, int n)
    {
        if(head == null)
            return -1;

	    Node itr = head;
	    int len = 0;
	    
	    while(itr != null){
	        itr = itr.next;
	        len++;
	    }
	    
	    if(len < n)
	        return -1;
	        
        itr = head;
	    for(int i=1;i<len-n+1;i++){
	        itr = itr.next;
	    }
	    return itr.data;
    }
}
	
