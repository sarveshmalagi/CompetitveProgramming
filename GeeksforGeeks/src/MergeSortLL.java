
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/sort-list/
/**
 * Definition for singly-linked list.*/
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class MergeSortLL {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head; 
        }
        
        ListNode slow = head,fast = head,prev = null;
        
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1,l2);
    }
    
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode sorted = new ListNode(0),itr = sorted;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                itr.next = l1;
                l1 = l1.next;
            }
            else{
                itr.next = l2;
                l2 = l2.next;
            }
            itr = itr.next;
        }
        
        if(l1 != null){
            itr.next = l1;
        }
        
        if(l2 != null){
            itr.next = l2;
        }
        return sorted.next;
    }
}
