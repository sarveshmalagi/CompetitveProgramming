import java.io.BufferedReader;
import java.io.InputStreamReader;

class Boat {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            String[] line = br.readLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int l = Integer.parseInt(line[1]);
            int count = 0;
            if(n<l){
                count += Math.pow(n-1,n);
                count += Math.pow(n,n-l);
            }
            else{
                count += Math.pow(n-1,l);
            }
            System.out.println(count);
        }
    }
}
