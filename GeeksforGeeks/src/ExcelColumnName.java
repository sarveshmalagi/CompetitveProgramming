import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class ExcelColumnName {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			while(n > 0){
				char c;
				if(n%26 != 0){
					c = (char)('A'+(n%26)-1);
					n = n/26;
				}
				else{
					c = 'Z';
					n = n/26-1;
				}
				sb.append(c);
				
			}
			System.out.println(sb.reverse());
		}
	}
}
