import java.util.ArrayList;

/**
 * @author ssm
 *
 */

public class SerializeBinaryTree {
	int index;
	public String serialize(Tree root,ArrayList<Integer> aa) {
        StringBuilder sb = new StringBuilder();
        index = 0;
        serializeUtil(root,aa);
        
        for(int x : aa){
            sb.append(x+" ");
        }
        
        return sb.toString();
    }
	//store preorder with a "-1" for null pointers
    void serializeUtil(Tree root,ArrayList<Integer> aa){
        if(root == null){
            aa.add(-1);
            return;
        }
        aa.add(root.data);
        serializeUtil(root.left,aa);
        serializeUtil(root.right,aa);
    }
    
    public Tree deSerialize(String data) {
        String[] preorder = data.split(" ");
        return deSerializeUtil(preorder);
    }
    
    Tree deSerializeUtil(String[] preorder){
        if(index >= preorder.length || preorder[index].equals("-1")){
            index++;
            return null;
        }
        
        Tree node = new Tree(Integer.parseInt(preorder[index++]));
        node.left = deSerializeUtil(preorder);
        node.right = deSerializeUtil(preorder);
        
        return node;
    }
}
