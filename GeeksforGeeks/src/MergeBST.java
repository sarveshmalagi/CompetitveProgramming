import java.util.ArrayList;

/**
 * @author ssm
 *
 */
//try O(h1+h2) space complexity
public class MergeBST {
	static ArrayList<Integer> inorder1,inorder2,res;
	public static void merge(NodeBST root1 , NodeBST root2){
        inorder1 = new ArrayList<Integer>();
        inorder2 = new ArrayList<Integer>();
        
        inorder(root1,true);
        inorder(root2,false);
        
        //System.out.println(inorder1+"\n"+inorder2);
        res = new ArrayList<Integer>();
        merge();
        for(int x : res)
            System.out.print(x+" ");
    }
    
    static void inorder(NodeBST root,boolean flag){
        if(root == null){
            return;
        }
        inorder(root.left,flag);
        if(flag){
            inorder1.add(root.data);
        }
        else{
            inorder2.add(root.data);
        }
        inorder(root.right,flag);
    }
    
    static void merge(){
        while(inorder1.size() > 0 && inorder2.size() > 0){
            if(inorder1.get(0) < inorder2.get(0)){
                res.add(inorder1.remove(0));
            }
            else{
                res.add(inorder2.remove(0));
            }
        }
        
        while(inorder1.size() > 0){
            res.add(inorder1.remove(0));
        }
        
        while(inorder2.size() > 0){
            res.add(inorder2.remove(0));
        }
    }
}
