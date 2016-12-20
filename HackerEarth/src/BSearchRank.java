/**
 * @author sarvesh
 *
 */
/*You have been given an array A consisting of N integers. All the elements in this array A are unique. You have to answer some queries based on the elements of this array. Each query will consist of a single integer x. You need to print the rank based position of this element in this array considering that the array is 1

indexed. The rank based position of an element in an array is its position in the array when the array has been sorted in ascending order.

Note: It is guaranteed that all the elements in this array are unique and for each x
belonging to a query, value ′x′

shall exist in the array

Input Format

The first line consists of a single integer N
denoting the size of array A. The next line contains N unique integers, denoting the content of array A. The next line contains a single integer q denoting the number of queries. Each of the next q lines contains a single integer x

denoting the element whose rank based position needs to be printed.

Output Format

You need to print q
integers denoting the answer to each query.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


class BSearchRank{
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ip2 = br.readLine().split(" ");
        int[] ip = new int[n];
        for(int i=0;i<n;i++){
        	ip[i] = Integer.parseInt(ip2[i]);
        }
        Arrays.sort(ip);
        int q = Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
        	int key = Integer.parseInt(br.readLine());
        	int rank = binarySearch(ip,key);
        	System.out.println(rank);
        }
    }
    
    static int binarySearch(int[] arr,int key){
    	int rank = 1;
    	int high = arr.length-1,low = 0;
    	while(low <= high){
    		int mid = (high+low)/2;
    		if(arr[mid] == key){
    			rank = mid;
    			break;
    		}
    		else if(arr[mid] < key){
    			low = mid+1;
    		}
    		else{
    			high = mid-1;
    		}
    	}
    	return rank+1;
    }
}
