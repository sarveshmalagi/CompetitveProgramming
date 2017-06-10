import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ssm
 *
 */
//Duplicates in 2nd array?
//try out the comoarator approach
public class RelativeSorting {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] ip = br.readLine().split(" ");
			int n = Integer.parseInt(ip[0]);
			int m = Integer.parseInt(ip[1]);
			
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for (int j = 0; j < n; j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			
			String[] temp2 = br.readLine().split(" ");
			int[] arr2 = new int[m];
			for (int j = 0; j < m; j++) {
				arr2[j] = Integer.parseInt(temp2[j]);
			}
			
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int j=0;j<n;j++){
				if(hm.containsKey(arr1[j])){
					hm.put(arr1[j],hm.get(arr1[j])+1);
				}
				else{
					hm.put(arr1[j], 1);
				}
			}
			HashMap<Integer,Integer> aux = new HashMap<Integer,Integer>();
			aux.putAll(hm);
			int ptr = 0;
			for(int j=0;j<m;j++){
				if(hm.containsKey(arr2[j])){
					int freq = hm.get(arr2[j]);
					for(int k=0;k<freq;k++){
						arr1[ptr++] = arr2[j];
					}
					hm.remove(arr2[j]);
				}
				else if(aux.containsKey(arr2[j])){
					int freq = aux.get(arr2[j]);
					for(int k=0;k<freq;k++){
						arr1[ptr++] = arr2[j];
					}
				}
			}
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
				for(int j=0;j<entry.getValue();j++)
					tempList.add(entry.getKey());
			}
			Collections.sort(tempList);
			for(int x : tempList){
				if(ptr < n)
					arr1[ptr++] = x;
			}
			printArray(arr1);
		}
	}
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
