
/**
 * @author ssm
 *https://leetcode.com/problems/hamming-distance/
 */
class Solution {
    public int hammingDistance(int x, int y) {
        String xor = Integer.toBinaryString(x^y);
        int dist = 0;
        for(int i=0;i<xor.length();i++){
            if(xor.charAt(i) == '1'){
                dist++;
            }
        }
        return dist;
    }
}