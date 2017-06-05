import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class NextGreater {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for(int i=0;i<t;i++){
			String ip = br.readLine();
			boolean flag = false;
			for(int k=ip.length()-1;k>0;k--){
				if(ip.charAt(k) > ip.charAt(k-1)){
					flag = true;
				}
			}
			if(!flag){
				System.out.println("not possible");
				continue outer;
			}
			int j = ip.length()-2;
			while(j > 0 && ip.charAt(j) >= ip.charAt(j+1)){
				j--;
			}
			char[] ipArr = ip.toCharArray();
			//printArray(ipArr);
			int minIndex = findMin(ipArr,j+1,ipArr[j]);
			char temp = ipArr[j];
			ipArr[j] = ipArr[minIndex];
			ipArr[minIndex] = temp;
			
			char[] sub = new char[ip.length()-j-1];
			for(int k=0;k<sub.length;k++){
				sub[k] = ipArr[k+j+1];
			}
			Arrays.sort(sub);
			String sortedSub = new String(sub);
			String res = new String(ipArr);
			res = res.substring(0,j+1);
			res = res + sortedSub;
			System.out.println(res);
		}
	}
	
	static int findMin(char[] c,int index,char ele){
		int min = index;
		for(int i=index+1;i<c.length;i++){
			if(c[i] < c[min] && c[i] > ele){
				min = i;
			}
		}
		return min;
	}
}
