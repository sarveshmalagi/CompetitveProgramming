
/**
 * @author ssm
 *
 */
public class MergeDesLL {
	Node mergeResult(Node node1, Node node2){
		    Node itr1 = node1,itr2 = node2;
		    
		    Node res = null;
		    while(itr1 != null && itr2 != null){
		        if(itr1.data < itr2.data){
		            Node temp = itr1.next;
		            itr1.next = res;
		            res = itr1;
		            itr1 = temp;
		        }
		        else{
		            Node temp = itr2.next;
		            itr2.next = res;
		            res = itr2;
		            itr2 = temp;
		        }
		    }
		    
		    while(itr1 != null){
		        Node temp = itr1.next;
		        itr1.next = res;
		        res = itr1;
		        itr1 = temp;
		    }
		    
		    while(itr2 != null){
		        Node temp = itr2.next;
		        itr2.next = res;
		        res = itr2;
		        itr2 = temp;
		    }
		    return res;
	    }
}
