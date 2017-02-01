
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class ReverseVowels {
	public String reverseVowels(String s) {
        char[] s_arr = s.toCharArray();
        int i = 0,j = s.length()-1;
        while(i<j){
            while((i<j) && !isVowel(s_arr[i])){
                i++;
                //System.out.println("inc");
            }
            while(i<j && !isVowel(s_arr[j])){
                j--;
                //System.out.println("dec");
            }
            //System.out.println("swapping "+s_arr[i]+" and "+s_arr[j]);
            char temp = s_arr[i];
            s_arr[i] = s_arr[j];
            s_arr[j] = temp;
            i++;
            j--;
        }
        return new String(s_arr);
    }
    
    static boolean isVowel(char c){
        if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U')
            return true;
        else
            return false;
    }
}
