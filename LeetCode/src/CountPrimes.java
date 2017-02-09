
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/count-primes/
//loop conditions?
public class CountPrimes {
	public int countPrimes(int n) {
        boolean[] primes = new boolean[n+1];
        for(int i=0;i<=n;i++){
            primes[i] = true;
        }
        for(int i=2;i*i<=n;i++){
            if(primes[i] == true){
                for(int j=i*i;j<=n;j+=i){
                    if(j%i == 0)
                        primes[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n;i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}
