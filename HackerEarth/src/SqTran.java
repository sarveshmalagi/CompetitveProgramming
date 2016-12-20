import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Square Inc. processes thousands of transactions daily amounting to millions of dollars. They also have a daily target that they must achieve. Given a list of transactions done by Square Inc. and a daily target your task is to determine at which transaction does Square achieves the same.

Input:
First line contains T, number of transactions done by Square in a day.
The following line contains T integers, the worth of each transactions.
Next line contains Q, the no of queries.
Next Q lines contain an integer each representing the daily target.

Output:
For each query, print the transaction number where the daily limit is achieved or -1 if the target can't be achieved.  
 */

/**
 * @author sarvesh
 *
 */
public class SqTran {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] A = new int[t];
		String[] ip1 = br.readLine().split(" ");
		for(int i=0;i<t;i++){
			A[i] = Integer.parseInt(ip1[i]);
		}
		for(int i=1;i<t;i++){
			A[i] = A[i]+A[i-1];		//cumulative amt.
		}
		int q = Integer.parseInt(br.readLine());
		for(int i=0;i<q;i++){
			int target = Integer.parseInt(br.readLine());
			int index = binarySearch(A,target);
			if(index > 0 && index <= t-1 && A[index] >= target){
				System.out.println(index+1);
			}
			else if(index > 0 && index+1 <= t-1 && A[index+1] >= target){
				System.out.println(index+2);
			}
			else{
				System.out.println("-1");
			}
		}
	}
	
	static int binarySearch(int[] arr,int key){
    	int rank = -1;
    	int high = arr.length-1,low = 0;
    	while(low <= high){
    		int mid = (high+low)/2;
    		if(arr[mid] == key){
    			rank = mid;
    			break;
    		}
    		else if(arr[mid] < key){
    			low = mid+1;
    			rank = mid+1;
    		}
    		else{
    			high = mid-1;
    			rank = mid-1;
    		}
    	}
    	return rank;
    }
}
