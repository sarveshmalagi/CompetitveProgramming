import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
public class GenerateBinary {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			Queue<String> queue = new LinkedList<String>();
			queue.add("1");
			int count = 1;
			StringBuilder res = new StringBuilder();
			while(count <= n){
				String num = queue.remove();
				res.append(num);
				res.append(" ");
				queue.add(num+"0");
				queue.add(num+"1");
				count++;
			}
			System.out.println(res);
		}
	}
}
