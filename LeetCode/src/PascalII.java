import java.util.ArrayList;
import java.util.List;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/pascals-triangle-ii/
//O(k) space complexity
public class PascalII {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> ret_list = new ArrayList<Integer>();
        if(rowIndex == 0){
            ret_list.add(1);
            return ret_list;
        }
        ret_list.add(1);
        ret_list.add(1);
        if(rowIndex == 1){
            return ret_list;
        }
        for(int i=2;i<=rowIndex;i++){
            ArrayList<Integer> pascal = new ArrayList<Integer>();
            pascal.add(1);
            for(int j=1;j<i;j++){
                pascal.add(ret_list.get(j-1)+ret_list.get(j));
            }
            pascal.add(1);
            ret_list.clear();
            ret_list.addAll(pascal);
            pascal.clear();
        }
        return ret_list;
    }
}
