import java.util.*;
import java.lang.*;
import java.io.*;

class NumOcc {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] temp = br.readLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int x = Integer.parseInt(temp[1]);
			String[] ip = br.readLine().split(" ");
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(ip[j]);
			}
			int startIndex = searchStart(arr,n,x);
			int endIndex = searchEnd(arr,n,x);
			if(startIndex == -1 || endIndex == -1){
			    System.out.println(startIndex);
			}
			else{
			    System.out.println(endIndex-startIndex+1);   
			}
		}
	}

	private static int searchStart(int[] arr, int n, int x) {
		int low = 0,high = n-1,mid = low+(high-low)/2;
		
		while(low <= high){
			mid = low+(high-low)/2;
			if(arr[mid] == x){
			    if((mid-1 >= 0 && arr[mid-1] < x) || (mid == 0 && arr[mid] == x)){
			        return mid;   
			    }
				else{
				    high = mid-1;
				}
			}
			else if(arr[mid] < x){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return -1;
	}
	
	private static int searchEnd(int[] arr, int n, int x) {
		int low = 0,high = n-1,mid = low+(high-low)/2;
		
		while(low <= high){
			mid = low+(high-low)/2;
			if(arr[mid] == x){
			    if((mid+1 < n && arr[mid+1] > x) || (mid == n-1 && arr[mid] == x)){
			        return mid;   
			    }
				else{
				    low = mid+1;
				}
			}
			else if(arr[mid] < x){
				low = mid+1;
			}
			else{
				high = mid-1;
			}
		}
		return -1;
	}
}