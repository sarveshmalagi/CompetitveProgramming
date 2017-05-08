import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ssm
 *
 */
public class SumPairs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			String[] var = br.readLine().split(" ");
			int n = Integer.parseInt(var[0]);
			int m = Integer.parseInt(var[1]);
			int x = Integer.parseInt(var[2]);
			
			String[] temp1 = br.readLine().split(" ");
			int[] arr1 = new int[n];
			for (int j=0; j<n;j++) {
				arr1[j] = Integer.parseInt(temp1[j]);
			}
			
			String[] temp2 = br.readLine().split(" ");
			int[] arr2 = new int[m];
			for(int j=0;j<m;j++){
				arr2[j] = Integer.parseInt(temp2[j]);
			}
			
			HashSet<Integer> set =  new HashSet<Integer>();
			for(int j=0;j<n;j++){
				set.add(arr1[j]);
			}
			//System.out.println(set);
			List<Pairs> opList = new ArrayList<Pairs>();
			for(int j=0;j<m;j++){
				//System.out.println(arr2[j]);
				if(set.contains(x-arr2[j])){
					//System.out.println(x-arr2[j]+" "+arr2[j]);
					opList.add(new Pairs(x-arr2[j],arr2[j]));
				}
			}
			Collections.sort(opList);
			if(opList.size() > 0){
			    if(opList.size() > 1)
				    System.out.print(opList.get(0).x+" "+opList.get(0).y+",");
				else
	               System.out.print(opList.get(0).x+" "+opList.get(0).y);
				for(int j=1;j<opList.size()-1;j++){
					System.out.print(" "+opList.get(j).x+" "+opList.get(j).y+",");
				}
				if(opList.size() > 1)
				    System.out.print(" "+opList.get(opList.size()-1).x+" "+opList.get(opList.size()-1).y);	
				System.out.println();
			}
			else{
				System.out.println("-1");
			}
		}
	}
}

class Pairs implements Comparable<Pairs>{
	int x,y;
	
	public Pairs(int x,int y){
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Pairs arg0) {
		// TODO Auto-generated method stub
		if(this.x < arg0.x){
			return -1;
		}
		else if(this.x > arg0.x){
			return 1;
		}
		else
			return 0;
	}	
}

