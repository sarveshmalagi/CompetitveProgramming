import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author ssm
 *
 */
//try quicksort O(nlogn) solution
public class NutsAndBolts {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] nuts = br.readLine().split(" ");
			String[] bolts = br.readLine().split(" ");
			HashSet<Character> nutsSet = new HashSet<Character>();
			HashSet<Character> boltsSet = new HashSet<Character>();
			for(int j=0;j<n;j++){
				nutsSet.add(nuts[j].charAt(0));
				boltsSet.add(bolts[j].charAt(0));
			}
			String order = "!#$%&*@^~";
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<order.length();j++){
				char c = order.charAt(j);
				if(nutsSet.contains(c) && boltsSet.contains(c)){
					sb.append(c+" ");
				}
			}
			System.out.println(sb+"\n"+sb);
		}
	}
}
