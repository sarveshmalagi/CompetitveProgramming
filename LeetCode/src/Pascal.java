import java.util.ArrayList;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/pascals-triangle/
public class Pascal {
	public List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        pascal.add(new ArrayList<Integer>());
        pascal.get(0).add(1);
        if(numRows == 1){
            return pascal;
        }
        pascal.add(new ArrayList<Integer>());
        pascal.get(1).add(1);
        pascal.get(1).add(1);
        if(numRows == 2){
            return pascal;
        }
        
        for(int i=2;i<numRows;i++){
            pascal.add(new ArrayList<Integer>());
            pascal.get(i).add(1);
            for(int j=1;j<i;j++){
                pascal.get(i).add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
            }
            pascal.get(i).add(1);
        }
        
        return pascal;
    }
}
