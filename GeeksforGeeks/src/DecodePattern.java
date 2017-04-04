import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class DecodePattern {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			StringBuilder number = new StringBuilder();
			number.append("1");
			int loop = 0;
			while(loop < n-1){
				StringBuilder temp = new StringBuilder();
				int j = 0;
				while(j < number.length()){
					int count = 1;
					char c = number.charAt(j);
					j++;
					while(j < number.length() && number.charAt(j) == c){
						j++;
						count++;
					}
					temp.append(count);
					temp.append(c);
				}
				number = temp;
				loop++;
			}
			System.out.println(number);
		}
	}
}
