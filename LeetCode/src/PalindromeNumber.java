
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/palindrome-number/
//less comparisons?
public class PalindromeNumber {
	public boolean isPalindrome(int x){
        if(x < 0)
            return false;
        int nofdigits = 0;
        int temp = x;
        while(temp > 0){
            temp /= 10;
            nofdigits++;
        }
        //System.out.println(nofdigits);
        temp = x;
        long reverse = 0;
        int i = 0;
        while(i<=nofdigits){
            reverse += temp%10*Math.pow(10,nofdigits-i-1);
            temp /= 10;
            i++;
        }
        //System.out.println(reverse);
        while(reverse > 0){
            if(reverse%10 != x%10){
                return false;
            }
            reverse /= 10;
            x /= 10;
        }
        return true;
    }
}
