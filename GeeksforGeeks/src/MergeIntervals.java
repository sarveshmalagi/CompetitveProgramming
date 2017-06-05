import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * @author ssm
 *
 */
//http://practice.geeksforgeeks.org/problems/overlapping-intervals/0
//O(1) space solution possible if sorted in decreasing order of start times
public class MergeIntervals {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			int[] arr = new int[2*n];
			for (int j = 0; j < 2*n; j++) {
				arr[j] = Integer.parseInt(temp[j]);
			}
			Interval[] intervalArr = new Interval[n];
			for(int j=0;j<n;j++){
				intervalArr[j] = new Interval(arr[2*j],arr[2*j+1]);
			}
			Arrays.sort(intervalArr);
			Stack<Interval> stack = new Stack<Interval>();
			
			stack.push(intervalArr[0]);
			for(int j=0;j<n;j++){
				if(intervalArr[j].start <= stack.peek().end){
					Interval popped = stack.pop();
					stack.push(new Interval(popped.start,Integer.max(intervalArr[j].end,popped.end)));
				}
				else{
					stack.push(intervalArr[j]);
				}
			}
			ArrayList<Interval> resList = new ArrayList<Interval>();
			while(!stack.isEmpty()){
				Interval op = stack.pop();
				resList.add(op);
			}
			Collections.reverse(resList);
			for(Interval inter : resList){
				System.out.print(inter.start+" "+inter.end+" ");
			}
			System.out.println();
		}
	}
}

class Interval implements Comparable{
	int start,end;
	
	public Interval(int start,int end){
		this.start = start;
		this.end = end;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object arg0) {
		Interval obj = (Interval)arg0;
		if(this.start > obj.start){
			return 1;
		}
		else if(this.start < obj.start){
			return -1;
		}
		return 0;
	}
	
}
