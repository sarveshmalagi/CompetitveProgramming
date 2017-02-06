
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/linked-list-cycle/
//check out alternatives for faster runtime
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head,fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.val == fast.val){
                return true;
            }
        }
        return false;
    }
}
