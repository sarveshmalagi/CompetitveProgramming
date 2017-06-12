import java.util.Stack;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/maximal-rectangle/#/description
public class MaxAreaRect {
	    public int maximalRectangle(char[][] matrix) {
	        int m = matrix.length;
	        if(m == 0){
	            return 0;
	        }
	        int n = matrix[0].length;
	        int[][] mat = new int[m][n];
	        for(int i=0;i<n;i++){
	            mat[0][i] = matrix[0][i]-'0';
	        }
	        
	        for(int i=1;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(matrix[i][j] == '1')
	                    mat[i][j] = (matrix[i][j]-'0') + mat[i-1][j];
	            }
	        }
	        
	        int maxArea = Integer.MIN_VALUE;
	        int[] row = new int[n];
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                row[j] = mat[i][j];
	            }
	            int area = histArea(row,n);
	            if(area > maxArea){
	                maxArea = area;
	            }
	        }
	        
	        return maxArea;
	    }
	    
	    public int histArea(int[] arr,int n){
	        Stack<Integer> stack = new Stack<Integer>();
				int j = 0,maxArea = 0;
				while(j<n){
					if(stack.isEmpty() || arr[stack.peek()] < arr[j]){
						stack.push(j++);
					}
					else{
						int tp = stack.pop();
						int area = arr[tp]*(stack.isEmpty()?j:(j-stack.peek()-1));
						if(area > maxArea){
							maxArea = area;
						}
					}
				}
				
				while(!stack.empty()){
					int tp = stack.pop();
					int area = arr[tp]*(stack.isEmpty()?j:(j-stack.peek()-1));
					if(area > maxArea){
						maxArea = area;
					}
				}
				return maxArea;
	    }
	}
