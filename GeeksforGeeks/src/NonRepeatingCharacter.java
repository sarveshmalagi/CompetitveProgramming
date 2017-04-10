import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author ssm
 *
 */
public class NonRepeatingCharacter {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine().trim());
			String ip = br.readLine();
			HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			for(int j=0;j<n;j++){
				if(!hm.containsKey(ip.charAt(j))){
					hm.put(ip.charAt(j),1);
				}
				else{
					hm.put(ip.charAt(j), hm.get(ip.charAt(j))+1);
				}
			}
			boolean flag = false;
			for(int j=0;j<n;j++){
				if(hm.containsKey(ip.charAt(j))){
					if(hm.get(ip.charAt(j)) == 1){
						System.out.println(ip.charAt(j));
						flag = true;
						break;
					}
				}
			}
			if(flag != true){
				System.out.println("-1");
			}
		}
	}
}
