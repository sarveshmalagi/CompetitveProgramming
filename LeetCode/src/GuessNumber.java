
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/guess-number-higher-or-lower/
//Binary search
public class GuessNumber {
	public int guessNumber(int n) {
        long low = 1,high = n;
        long mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(guess((int)mid) == 0){
                return (int)mid;
            }
            else if(guess((int)mid) == -1){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return (int)mid;
    }
	
	int guess(int num){
		return 1;
	}
}
