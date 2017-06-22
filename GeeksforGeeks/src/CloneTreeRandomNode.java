import java.util.HashMap;

/**
 * @author ssm
 *
 */
class Tree{
	int data;
	Tree left,right,random;
	Tree(int d){
		data=d;
		left=null;
		right=null;
		random=null;
	}
}

class CloneTreeRandomNode{
	public static Tree cloneTree(Tree tree){
	        if(tree == null)
	            return tree;
	        HashMap<Tree,Tree> map = new HashMap<Tree,Tree>();
	        Tree clone = cloneLeftRight(tree,map);
	        copyRandom(tree,clone,map);
	        
	        return clone;
	    }
	    
	    static Tree cloneLeftRight(Tree tree,HashMap<Tree,Tree> map){
	        if(tree == null)
	            return tree;

	        Tree clone = new Tree(tree.data);
	        map.put(tree,clone);
	        
	        clone.left = cloneLeftRight(tree.left,map);
	        clone.right = cloneLeftRight(tree.right,map);
	        
	        return clone;
	    }
	    
	    static void copyRandom(Tree tree,Tree clone,HashMap<Tree,Tree> map){
	        if(tree == null)
	            return;
	        clone.random = map.get(tree).random;
	        copyRandom(tree.left,clone.left,map);
	        copyRandom(tree.right,clone.right,map);
	    }
}