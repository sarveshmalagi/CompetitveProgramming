
/**
 * @author ssm
 *
 */
import java.io.*;

public class UglyNumbers {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
		    int n = Integer.parseInt(br.readLine());
				System.out.println(getNthUglyNo(n));
		}
	}
	
	static int getNthUglyNo(int n){
		int[] ugly = new int[n];
		int i2 = 0,i3 = 0,i5 = 0;
		int mul2 = 2,mul3 = 3,mul5 = 5;
		int next_mul = 1;
		ugly[0] = 1;
		for(int i=1;i<n;i++){
			next_mul = min(mul2,mul3,mul5);
			ugly[i] = next_mul;
			if(mul2 == next_mul){
				i2++;
				mul2 = ugly[i2]*2;
			}
			if(mul3 == next_mul){
				i3++;
				mul3 = ugly[i3]*3;
			}
			if(mul5 == next_mul){
				i5++;
				mul5 = ugly[i5]*5;
			}
		}
		return next_mul;
	}
    
	static int min(int a,int b,int c){
		return (a<b)&&(a<c)?a:(b<c)?b:c;
	}
}
