import java.util.ArrayList;

/**
 * @author ssm
 *
 */
public class ThreeWayPartition {
	public ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal){
        int l = 0,h = A.size()-1;
        for(int i=0;i<=h;){
            if(A.get(i) < lowVal){
                int temp = A.get(l);
                A.set(l++,A.get(i));
                A.set(i,temp);
                i++;
            }
            else if(A.get(i) > highVal){
                int temp = A.get(h);
                A.set(h--,A.get(i));
                A.set(i,temp);
            }
            else{
                i++;
            }
        }
        return A;
    }
}
