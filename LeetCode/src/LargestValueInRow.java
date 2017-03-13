import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class LargestValueInRow {
    public void DFSMod(TreeNode root,List<Integer> maxList,int depth) { // 0 indexed
        if(root == null){
            return;
        }
        if(depth == maxList.size()){
            maxList.add(root.val);
        }
        else{
            maxList.set(depth,Math.max(maxList.get(depth),root.val));
        }
        System.out.println(root.val);
        DFSMod(root.left,maxList,depth+1);
        DFSMod(root.right,maxList,depth+1);
    }
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxList = new ArrayList()<Integer>();
        DFSMod(root,maxList,0);
        return maxList;
    }
}