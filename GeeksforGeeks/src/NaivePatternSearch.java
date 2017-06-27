import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class NaivePatternSearch {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String ip = br.readLine();
			String pattern = br.readLine();
			boolean flag = false;
			
			for(int j=0;j<=ip.length()-pattern.length();j++){
			    int k;
				for(k=0;k<pattern.length();k++){
					if(ip.charAt(j+k) != pattern.charAt(k))
						break;
				}
				if(k == pattern.length()){
						flag = true;
				}
			}
			
			if(flag){
				System.out.println("found");
			}
			else{
				System.out.println("not found");
			}
		}
	}
}
