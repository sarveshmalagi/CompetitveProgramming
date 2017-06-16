
/**
 * @author ssm
 *
 */
public class MaxSumPathArr {
	int maxPathSum(int ar1[], int ar2[]){
		int sum1 = 0,sum2 = 0,maxSum = 0,i = 0,j = 0;       
		while(i < ar1.length && j < ar2.length){
			if(ar1[i] < ar2[j]){
				sum1 += ar1[i++];
			}
			else if(ar2[j] < ar1[i]){
				sum2 += ar2[j++];
			}
			else{
				maxSum += Integer.max(sum1,sum2);
				sum1 = 0;
				sum2 = 0;              
				while(i < ar1.length && j < ar2.length && ar1[i] == ar2[j]){
					maxSum += ar1[i];
					i++;
					j++;
				}
			}
		}       
		while(i < ar1.length){
			sum1 += ar1[i++];
		}        
		while(j < ar2.length){
			sum2 += ar2[j++];
		}        
		maxSum += Integer.max(sum1,sum2);        
		return maxSum;
	}
}
