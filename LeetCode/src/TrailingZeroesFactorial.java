
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/factorial-trailing-zeroes/
public class TrailingZeroesFactorial {
	//intial solution
	//faster approach possible?
    public int trailingZeroes(int n) {
        int k = 1,sum = 0;
        while(n/Math.pow(5,k) >= 1){
            sum += Math.floor(n/Math.pow(5,k));
            k++;
        }
        return sum;
    }
    //0s are a result of 2s and 5s
    //find out the number of 5s
    //faster method
    public int trailingZeroesImproved(int n) {
        if(n == 0)
            return 0;
        else
            return n/5+trailingZeroes(n/5);
    }
}
