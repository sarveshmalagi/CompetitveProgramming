import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author ssm
 *
 */
public class BottomView {
	public void bottomView(NodeBST root){
	        if(root == null){
	            return;
	        }
	        
	        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
	        Queue<NodeBST> queue = new LinkedList<NodeBST>();
	        
	        int hd = 0;
	        queue.add(root);
	        root.hd = hd;
	        
	        while(!queue.isEmpty()){
	            NodeBST curr = queue.poll();
	            hd = curr.hd;
	            
	            map.put(hd,curr.data);
	            
	            if(curr.left != null){
	                curr.left.hd = hd-1;
	                queue.add(curr.left);
	            }
	            if(curr.right != null){
	                curr.right.hd = hd+1;
	                queue.add(curr.right);
	            }
	        }
	        
	        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
	            System.out.print(entry.getValue()+" ");
	        }
	    }
}
