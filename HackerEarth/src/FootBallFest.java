
/**
 * @author ssm
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//https://www.hackerearth.com/challenge/college/iiitb-coding-practice-chapter-2/algorithm/0a67bf945b71440ea9e150e31e922a02/
class FootBallFest {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            String[] line1 = br.readLine().split(" ");
            int init = Integer.parseInt(line1[1]);
            int N = Integer.parseInt(line1[0]);
            char[] passes = new char[N];
            int[] id = new int[N];
            for (int i = 0; i < N; i++) {
                String[] line = br.readLine().split(" ");
                passes[i] = line[0].charAt(0);
                if(line.length > 1){
                    id[i] = Integer.parseInt(line[1]);
                }
            }
            int curr = init;
            int prev = 0;
            for(int i=1;i<N;i++){
                if(passes[i] == 'P'){
                    prev = curr;
                    curr = id[i];
                }
                else{
                    int temp = curr;
                    curr = prev;
                    prev = temp;
                }
            }
            System.out.println("Player "+curr);   
        }
    }
}
