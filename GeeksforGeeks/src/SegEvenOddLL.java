import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * @author ssm
 *
 */
public class SegEvenOddLL {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			LinkedList<Integer> ll = new LinkedList<Integer>();
			for(int j=0;j<n;j++){
				ll.add(Integer.parseInt(temp[j]));
			}
			int lastEven = 0;
			for(int j=0;j<n;j++){
				if(ll.get(j)%2 == 0){
					int swap = ll.get(j);
					ll.remove(j);
					ll.add(lastEven, swap);
					lastEven++;
				}
			}
			for(int x : ll){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
