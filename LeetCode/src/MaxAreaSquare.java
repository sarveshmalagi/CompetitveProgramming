
/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/maximal-square/
public class MaxAreaSquare {
	    public int maximalSquare(char[][] matrix) {
	        if(matrix.length < 1) return 0;
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int[][] table = new int[m][n];
	        int max = Integer.MIN_VALUE;

	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(i == 0 || j == 0){
	                    table[i][j] = matrix[i][j]-'0';
	                    
	                }
	                else if(matrix[i][j] == '1'){
	                    table[i][j] = min(table[i][j-1],table[i-1][j],table[i-1][j-1])+1;
	                }
	                if(table[i][j] > max){
	                        max = table[i][j];
	                }
	            }
	        }
	        
	/*        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(table[i][j]+" ");
	            }
	            System.out.println();
	        }*/
	        return max*max;
	    }
	    
	    static int min(int a,int b,int c){
	        return (a<b)&&(a<c)?a:(b<c)?b:c;
	    }
	}