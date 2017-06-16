
/**
 * @author ssm
 *
 */
public class CompareLL {
	int compare(Node node1, Node node2){
	        Node itr1 = node1,itr2 = node2;
	        
	        while(itr1 != null && itr2 != null){
	            if(itr1.data == itr2.data){
	                itr1 = itr1.next;
	                itr2 = itr2.next;
	            }
	            else if(itr1.data < itr2.data){
	                return -1;
	            }
	            else{
	                return 1;
	            }
	        }
	        
	        if(itr1 == null && itr2 == null){
	            return 0;
	        }
	        else if(itr1 != null){
	            return 1;
	        }
	        return -1;
	    }
}
