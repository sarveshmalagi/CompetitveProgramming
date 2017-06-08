import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ssm
 *
 */
public class LargestNoFormed {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] arr = br.readLine().split(" ");
			Arrays.sort(arr,new NumberComparator());
			StringBuilder res = new StringBuilder();
			for(String x : arr){
				res.append(x);
			}
			System.out.println(res);
		}
	}
}

class NumberComparator implements Comparator<String>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(String arg0, String arg1) {
		
		int xy = Integer.parseInt(arg0+arg1);
		int yx = Integer.parseInt(arg1+arg0);
		
		if(xy > yx){
			return -1;
		}
		else if(yx > xy){
			return 1;
		}
		return 0;
	}
	
}