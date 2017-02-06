
/**
 * @author ssm
 *
 */
//https://www.hackerearth.com/challenge/college/iiitb-coding-practice-chapter-2/algorithm/9944a626d33b4943983b666ce0a4278b/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String[] line1 = br.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int k = Integer.parseInt(line1[1]);
            String[] line2 = br.readLine().split(" ");
            ArrayList<Integer> ll = new ArrayList<Integer>();
            for(String s : line2){
                ll.add(Integer.parseInt(s));
            }
            while(ll.size() > n-k){
                boolean deleted = false;
                for(int z=0;z<ll.size()-1;z++){
                    if(ll.get(z) < ll.get(z+1)){
                        ll.remove(z);
                        deleted = true;
                        break;
                    }
                }
                if(deleted == false){
                    ll.remove(ll.size()-1);
                }
            }
            for(Integer x : ll){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
