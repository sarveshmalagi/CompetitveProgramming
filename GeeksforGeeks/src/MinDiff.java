import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author ssm
 *
 */
public class MinDiff {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer:for(int i=0;i<t;i++){
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[100001];
			for (int j = 0; j < n; j++) {
				int ele = Integer.parseInt(temp[j]);
				arr[ele]++;
				if(arr[ele] > 1){
				    System.out.println("0");
				    continue outer;
				}
			}
			int lastIndex = -1,minDiff = Integer.MAX_VALUE;
			for(int j=1;j<100001;j++){
				if(arr[j] != 0){
					if(lastIndex != -1 && j-lastIndex < minDiff){
						minDiff = j-lastIndex;
					}
					lastIndex = j;
				}
			}
			System.out.println(minDiff);
		}
	}
}
