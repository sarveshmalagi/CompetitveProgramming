
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/palindrome-linked-list/
//try to workout the details once more'
//O(n) space solution is trivial
public class PalindromeLL {
	public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        //find out the mid of the list
        ListNode mid = head;
        ListNode end = head;
        while(end != null && end.next != null && end.next.next != null){
            end  = end.next.next;
            mid = mid.next;
        }
        //reverse the 2nd half of the list
        mid = reverseList(mid);
        ListNode iter1 = head;
        ListNode iter2 = mid;
        while(iter1 != null && iter2.next != null){
            if(iter1.val != iter2.val){
                return false;
            }
            iter1 = iter1.next;
            iter2 = iter2.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode p=null,q=head,r=head.next;
        while(q != null){
            q.next = p;
            p = q;
            q = r;
            r = (r==null || r.next==null)?null:r.next;
        }
        head = p;
        return head;
    }
}
