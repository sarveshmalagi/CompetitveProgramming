
/**
 * @author ssm
 *
 */

class MiddleLL
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
   if(head == null){
       return -1;
   }
   Node fast = head,slow = head;
   while(fast != null && fast.next != null){
       fast = fast.next.next;
       slow = slow.next;
   }
   return slow.data;
   }
    
 // This function should delete node from linked list. The function
 // may assume that node exists in linked list and is not last node
    void deleteNode(Node del)
    {
        del.data = del.next.data;
        del.next = del.next.next;
    }
}