import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author ssm
 *
 */
public class CircularTour {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		outer : for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String[] temp = br.readLine().split(" ");
			PetrolPump[] pumps = new PetrolPump[n];
			for (int j = 0,count = 0; j < 2*n; j+=2) {
				pumps[count++] = new PetrolPump(Integer.parseInt(temp[j]),Integer.parseInt(temp[j+1]));
			}
			
			int start = 0,end = 1;
			int curr_petrol = pumps[start].petrol-pumps[start].dist;
			
			while(start != end || curr_petrol < 0){
				
				while(curr_petrol < 0 && start != end){
					curr_petrol -= pumps[start].petrol - pumps[start].dist;
					start = (start+1)%n;
					
					if(start == 0){
						System.out.println("-1");
						continue outer;
					}
				}
				
				curr_petrol += pumps[end].petrol - pumps[end].dist;
				end = (end+1)%n;
			}
			System.out.println(start);
		}
	}
}

class PetrolPump{
	int petrol,dist;
	
	public PetrolPump(int petrol,int dist){
		this.petrol = petrol;
		this.dist = dist;
	}
}