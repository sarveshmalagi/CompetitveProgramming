
/**
 * @author ssm
 *
 */
//http://www.geeksforgeeks.org/sort-a-linked-list-of-0s-1s-or-2s/
/*
Sort the list of 0's,1's and 2's
The input list will have at least one element  
Node is defined as 
class Node {
int value;
Node next;

Node(int value) {
 this.value = value;

}

}

*/
class Sort012LL{
  void linksort(Node head){
      int[] count = {0,0,0};
      
      Node itr = head;
      while(itr != null){
          count[itr.data]++;
          itr = itr.next;
      }
      
      int i = 0;
      itr = head;
      while(itr != null){
          if(count[i]<=0){
              i++;
              continue;
          }
          itr.data = i;
          count[i]--;
          itr = itr.next;
      }
  }
}