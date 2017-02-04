
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/remove-linked-list-elements/
//reflect more on this
//try to get better runtime
public class RemoveElementLL {
	public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        head.next = removeElements(head.next,val);
        return head.val == val?head.next:head;
    }
}
