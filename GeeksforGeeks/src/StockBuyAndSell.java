import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class StockBuyAndSell {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			boolean flag = false;
			int buy = 0,sell = 0;
			for(int j=0;j<n-1;j++){
				if(arr[j] <= arr[j+1]){
					sell++;
				}
				else{
					if(arr[sell]-arr[buy] > 0){
						System.out.print("("+buy+" "+sell+")"+" ");
						flag = true;
					}
					buy = j+1;
					sell = j+1;
				}
				//System.out.println("buy: "+buy+" "+"sell: "+sell);
			}
			if(arr[sell]-arr[buy] > 0){
				System.out.print("("+buy+" "+sell+")");
				System.out.println();
				flag = true;
			}
			if(!flag)
				System.out.println("No Profit");
		}
	}
}
