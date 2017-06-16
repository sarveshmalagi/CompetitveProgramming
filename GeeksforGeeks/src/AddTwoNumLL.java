
/**
 * @author ssm
 *
 */
public class AddTwoNumLL {
	Node addTwoLists(Node first, Node second){
	        Node itr1 = first,itr2 = second;
	        Node res = null,prev = null,temp = null;
	        int carry = 0,sum = 0;
	        
	        while(itr1 != null || itr2 != null){
	            sum = (itr1!=null?itr1.data:0) + (itr2!=null?itr2.data:0)+carry;
	            carry = sum>=10?1:0;
	            sum = sum%10;
	            
	            temp = new Node(sum);
	            if(res == null){
	                res = temp;
	            }
	            else{
	                prev.next = temp;
	            }
	            prev = temp;
	            
	            if(itr1 != null){
	                itr1 = itr1.next;
	            }
	            if(itr2 != null){
	                itr2 = itr2.next;
	            }
	        }
	        
	        if(carry > 0){
	            temp.next = new Node(carry);
	        }
	        return res;
		}
}
