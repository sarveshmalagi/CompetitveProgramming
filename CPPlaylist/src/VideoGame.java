import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class VideoGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int h = Integer.parseInt(line1[1]);
		
		String[] line2 = br.readLine().split(" ");
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = Integer.parseInt(line2[j]);
		}
		String[] commands = br.readLine().split(" ");
		int position = 0,crane = 0;
		for(String com : commands){
			char c = com.charAt(0);
			if(c == '1'){
				if(position > 0){
					position--;
				}
			}
			else if(c == '2'){
				if(position < n-1){
					position++;
				}
			}
			else if(c == '3'){
				if(arr[position] > 0 && crane == 0){
					crane = 1;
					arr[position]--;
				}
			}
			else if(c == '4'){
				if(arr[position] < h && crane != 0){
					arr[position]++;
					crane = 0;
				}
			}
			else{
				break;
			}	
		}
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
