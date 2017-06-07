
/**
 * @author ssm
 *
 */
/* Node of a linked list */
class Node {
  int data;
   Node next;
   Node(int d)  { data = d;  next = null; }
}
//class for LinkedList creation
class Intersect
{
   Node head;  // head of list
  
}
/*This is method only submission.  You only need to complete the method. */



class LLInter
{
   Intersect llist3 = new Intersect(); // object of LinkedList having Intersection of two LinkedLists
   // Function  to find Intersection of two LinkedLists
   void getIntersection(Node head1, Node head2)
   {   
       Node itr = null;
       
       while(head1 != null && head2 != null){
           if(head1.data < head2.data){
               head1 = head1.next;
           }
           else if(head2.data < head1.data){
               head2 = head2.next;
           }
           else{
               if(llist3.head == null){
                   llist3.head = new Node(head1.data);
                   itr = llist3.head;
               }
               else{
                   Node temp = new Node(head1.data);
                   itr.next = temp;
                   itr = itr.next;
               }
               head1 = head1.next;
               head2 = head2.next;
           }
       }
   }
}
