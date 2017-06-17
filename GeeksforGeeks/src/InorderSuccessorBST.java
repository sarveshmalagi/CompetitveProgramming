
/**
 * @author ssm
 *
 */
public class InorderSuccessorBST {
	NodeBST succ;
	public NodeBST inorderSuccessor(NodeBST root,NodeBST k){
        if(root == null){
            return root;
        }
        
        if(root.data == k.data){
            if(root.right != null){
                NodeBST temp = root.right;
                while(temp.left != null)
                    temp = temp.left;
                succ = temp;
            }
            return succ;
        }
        
        if(root.data > k.data){
            succ = root;
            return inorderSuccessor(root.left,k);
        }
        else{
            return inorderSuccessor(root.right,k);
        }
    }
}
