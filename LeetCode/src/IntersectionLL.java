
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/intersection-of-two-linked-lists/
//can this be done in a single pass?
//try the hashmap approach
public class IntersectionLL {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0,countB = 0;
        while(tempA != null){
            tempA = tempA.next;
            countA++;
        }
        while(tempB != null){
            tempB = tempB.next;
            countB++;
        }
        tempA = headA;
        tempB = headB;
        if(countA < countB){
            while(countA != countB){
                tempB = tempB.next;
                countA++;
            }
        }
        else if(countB < countA){
            while(countB != countA){
                tempA = tempA.next;
                countB++;
            }
        }
        
        while(tempA != null && tempB != null){
            if(tempA.val == tempB.val){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}
