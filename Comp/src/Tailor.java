import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Jaime the Tailor's new customer wants to add distinct clusters to her dress, where each cluster is filled with a distinct number of buttons of a certain color. In other words, no two clusters should have the same color buttons.

The customer also has specific ideas about how much she wants to pay for each cluster in that for some cluster , she wants to pay at least dollars. In addition, she wants each cluster to contain a distinct number of buttons. And, finally, she wants to minimize her total cost.

Jaime stocks an infinite number of buttons in an infinite number colors at his shop, and each button costs dollars. Given , , and the amount of money that the customer wants to pay for each respective cluster, help Jaime by finding and printing a long integer denoting the minimum number of buttons he can use to satisfy her request.

Input Format

The first line contains two space-separated integers denoting the respective values of and .
The second line contains space-separated integers where each integer denotes the value of (i.e., the minimum amount of money she wants to spend on cluster ). 
 */

/**
 * @author sarvesh
 *
 */
public class Tailor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip1 = br.readLine().split(" ");
		int n = Integer.parseInt(ip1[0]);
		int p = Integer.parseInt(ip1[1]);
		String[]ip2 = br.readLine().split(" ");
		int[] costs = new int[n];
		for(int i=0;i<n;i++){
			costs[i] = Integer.parseInt(ip2[i]);
		}
		for(int i=0;i<n;i++){
			costs[i] = (int)Math.ceil(costs[i]*1.0/p);
		}
		Arrays.sort(costs);
		int sum = 0;
		for(int i=1;i<n;i++){
			if(costs[i] == costs[i-1])
				costs[i]++;
			sum += costs[i];
			//System.out.print(costs[i]);
		}
		System.out.println(sum+costs[0]);
	}
}
