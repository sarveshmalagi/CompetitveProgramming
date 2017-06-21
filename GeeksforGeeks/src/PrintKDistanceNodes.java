
/**
 * @author ssm
 *
 */
public class PrintKDistanceNodes {
	void printKdistance(NodeBST root, int k){
	        if(root == null){
	            return;
	        }
	        if(k == 0){
	            System.out.print(root.data+" ");
	        }
	        else{
	            printKdistance(root.left,k-1);
	            printKdistance(root.right,k-1);   
	        }
	    }
}
