
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class DuplicatesSrtdList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        while(temp.next != null){
            ListNode iter = temp.next;
            while(iter != null && temp.val == iter.val){
                iter = iter.next;
            }
            temp.next = iter;
            temp = temp.next!=null?temp.next:temp;
        }
        return head;
    }
}
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}