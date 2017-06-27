import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class KMP {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String ip = br.readLine();
			String pattern = br.readLine();
			
			int[] lps = calculatePrefixArr(pattern);
			System.out.println(Kmp(ip,pattern,lps));
			
		}
	}
	
	static int[] calculatePrefixArr(String ip){
		int[] lps = new int[ip.length()];
		
		int j = 0;
		lps[0] = 0;
		for(int i=1;i<ip.length();){
			if(ip.charAt(i) == ip.charAt(j)){
				lps[i] = j+1;
				i++;
				j++;
			}
			else{
				if(j != 0){
					j = lps[j-1];
				}
				else{
					lps[i] = 0;
					i++;
				}
			}
		}
		
		return lps;
	}
	
	static boolean Kmp(String ip,String pattern,int[] lps){
		int i= 0 ,j = 0;
		
		while(i < ip.length() && j < pattern.length()){
			if(ip.charAt(i) == pattern.charAt(j)){
				i++;
				j++;
			}
			else{
				if(j != 0){
					j = lps[j-1];
				}
				else{
					i++;
				}
			}
		}
		
		if(j == pattern.length()){
			return true;
		}
		return false;
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
