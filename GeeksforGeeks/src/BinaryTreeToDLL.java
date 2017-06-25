
/**
 * @author ssm
 *
 */
class NodeBST
{
	NodeBST left, right;
	int data;
	public int hd;
	
	NodeBST(int d)
	{
		data = d;
		left = right = null;
	}
	
}
public class BinaryTreeToDLL {
	NodeBST head;
	NodeBST BToDLL(NodeBST root){
		    if(root == null){
		        return root;
		    }
		    
		    BToDLL(root.right);
		    
		    root.right = head;
		    if(head != null){
		        head.left = root;
		    }
		    
		    head = root;
		    
		    BToDLL(root.left);
		    
		    return head;
	    }
}
