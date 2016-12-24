import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 question
 https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/discover-the-monk/
/**
 * @author sarvesh
 *
 */
public class Discover {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip1 = br.readLine().split(" ");
		int n = Integer.parseInt(ip1[0]);
		int q = Integer.parseInt(ip1[1]);
		String[] ip2 = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(ip2[i]);
		}
		Arrays.sort(arr);
		for(int i=0;i<q;i++){
			int query = Integer.parseInt(br.readLine());
			if(binarySearch(arr,query)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	
	static boolean binarySearch(int[] arr,int key){
		boolean flag = false;
    	int high = arr.length-1,low = 0;
    	while(low <= high){
    		int mid = (high+low)/2;
    		//System.out.print(mid+" ");
    		if(arr[mid] == key){
    			flag = true;
    			break;
    		}
    		else if(arr[mid] < key){
    			low = mid+1;
    		}
    		else{
    			high = mid-1;
    		}
    	}
    	//System.out.println();
    	return flag;
    }
}
