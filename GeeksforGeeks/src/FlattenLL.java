
/**
 * @author ssm
 *
 */
//Node class  used in the program
class Node2D
{
	int data;
	Node2D next;
	Node2D bottom;
	
	Node2D(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}

public class FlattenLL {
	Node2D flatten(Node2D root){
		if(root == null || root.next == null){
			return root;
		}
		root.next = flatten(root.next);
		root = merge(root,root.next);
		return root;
	}
		    
	Node2D merge(Node2D a,Node2D b){
		if(a == null)
			return b;
		if(b == null)
			return a;
			            
		Node2D res;
		       
		if(a.data < b.data){
			res = a;
			res.bottom = merge(a.bottom,b);
		}
		else{
			res = b;
			res.bottom = merge(a,b.bottom);
		}
		return res;
	}
}
