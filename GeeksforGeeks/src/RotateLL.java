
/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/rotate-a-linked-list/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
*/
class RotateLL{
    public void rotate(Node head,int k){
        if(k == 0)
            return;
        Node tail = head,itr = head,prev = null;
        
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next= head;
        
        int count = k;
        while(count > 0){
            prev = head;
            head = head.next;
            count--;
        }
        prev.next = null;
        
        itr = head;
        while(itr != null){
            System.out.print(itr.data+" ");
            itr = itr.next;
        }
    }
}
