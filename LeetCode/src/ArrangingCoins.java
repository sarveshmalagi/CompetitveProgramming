
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/arranging-coins/
//more info : https://en.wikipedia.org/wiki/Triangular_number
public class ArrangingCoins {
	public int arrangeCoins(int n) {
        return (int)((Math.sqrt(1+8.0*n)-1)/2);
    }
}
