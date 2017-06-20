import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class VerticalOrder {
	HashMap<Integer,ArrayList<Integer>> distanceMap;
	    int max,min;
	    void verticalOrder(NodeBST node) {
	        distanceMap = new HashMap<Integer,ArrayList<Integer>>();
	        max = Integer.MIN_VALUE;
	        min = Integer.MAX_VALUE;
	        
	        verticalOrderUtil(node,0);
	        
	        for(int i=min;i<=max;i++){
	            if(distanceMap.containsKey(i)){
	                for(int x : distanceMap.get(i)){
	                    System.out.print(x+" ");
	                }
	                System.out.print("$");
	            }
	        }
	    }
	    
	    void verticalOrderUtil(NodeBST node,int hDist){
	        if(node == null){
	            return;
	        }
	        
	        if(hDist < min){
	            min = hDist;
	        }
	        if(hDist > max){
	            max = hDist;
	        }
	        
	        if(distanceMap.containsKey(hDist)){
	            ArrayList<Integer> temp = distanceMap.get(hDist);
	            temp.add(node.data);
	            distanceMap.put(hDist,temp);
	        }
	        else{
	            ArrayList<Integer> temp = new ArrayList<Integer>();
	            temp.add(node.data);
	            distanceMap.put(hDist,temp);
	        }
	        
	        verticalOrderUtil(node.left,hDist-1);
	        verticalOrderUtil(node.right,hDist+1);
	    }
}
