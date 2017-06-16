
/**
 * @author ssm
 *
 */
public class ZigzagLL {
	public static void zigzag(Node phead){
	        Node itr = phead;
	        
	        boolean flag = true;
	        while(itr.next != null){
	            if(flag){
	                if(itr.data > itr.next.data){
	                    int temp = itr.data;
	                    itr.data = itr.next.data;
	                    itr.next.data = temp;
	                }
	            }
	            else{
	                if(itr.data < itr.next.data){
	                    int temp = itr.data;
	                    itr.data = itr.next.data;
	                    itr.next.data = temp;
	                }
	            }
	            flag = !flag;
	            itr = itr.next;
	        }
	        
	        itr = phead;
	        while(itr != null){
	            System.out.print(itr.data+" ");
	            itr = itr.next;
	        }
	        System.out.println();
	    }
}
