
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ret_arr = new int[m+n];
        int i=0,j=0,c=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                ret_arr[c++] = nums1[i++];
            }
            else{
                ret_arr[c++] = nums2[j++];
            }
        }
        while(i<m){
            ret_arr[c++] = nums1[i++];
        }
        while(j<n){
            ret_arr[c++] = nums2[j++];
        }
        System.arraycopy(ret_arr,0,nums1,0,m+n);
    }
}
