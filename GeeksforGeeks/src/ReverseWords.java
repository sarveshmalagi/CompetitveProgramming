import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class ReverseWords {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] str = br.readLine().split("\\.");
			for(int j=0;j<str.length/2;j++){
				String temp = str[j];
				str[j] = str[str.length-j-1];
				str[str.length-j-1] = temp;
			}
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<str.length-1;j++){
				sb.append(str[j]+".");
			}
			sb.append(str[str.length-1]);
			System.out.println(sb);
		}
	}
}
