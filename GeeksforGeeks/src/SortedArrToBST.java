import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class SortedArrToBST {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			
			NodeBST bst = createBST(arr,0,n-1);
			preOrder(bst);
			System.out.println();
		}
	}
	
	static NodeBST createBST(int[] arr,int l,int h){
		if(l > h){
			return  null;
		}
		
		int mid = (l+h)/2;
		NodeBST temp = new NodeBST(arr[mid]);
		
		temp.left = createBST(arr,l,mid-1);
		temp.right = createBST(arr,mid+1,h);
		
		return temp;
	}
	
	static void preOrder(NodeBST node) {
	        if (node == null) {
	            return;
	        }
	        System.out.print(node.data + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }
}
