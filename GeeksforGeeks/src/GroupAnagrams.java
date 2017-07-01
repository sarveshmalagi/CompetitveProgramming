import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author ssm
 *
 */
public class GroupAnagrams {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
		    int n = Integer.parseInt(br.readLine());
		    String[] list = br.readLine().split(" ");
		    
		    for(int j=0;j<list.length;j++){
		        char[] temp = list[j].toCharArray();
		        Arrays.sort(temp);
		        list[j] = new String(temp);
		    }
		    Arrays.sort(list);
		    ArrayList<Integer> counts = new ArrayList<Integer>();
		    int k = 0;
		    while(k < n){
		        int count = 1;
		        while(k < n-1 && list[k].equals(list[k+1])){
		            k++;
		            count++;
		        }
		        k++;
		        counts.add(count);
		    }
		    Collections.sort(counts);
		    for(int x : counts){
			    System.out.print(x+" ");
		    }
		    System.out.println();
		}
	}
}
