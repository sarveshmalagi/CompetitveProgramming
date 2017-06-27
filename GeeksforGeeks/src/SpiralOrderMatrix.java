
/**
 * @author ssm
 *
 */
public class SpiralOrderMatrix {
	public static void main(String[] args) {
		int[][] matrix = { {1,  2,  3,  4,  5,  6},
		                      {7,  8,  9,  10, 11, 12},
		                      {13, 14, 15, 16, 17, 18}
		                    };
		spiralTraverse(matrix,3,6);
	}
	
	static void spiralTraverse(int[][] matrix,int m,int n){
		int t = 0,r = n,d = m,l = 0;
		
		while(t < d && l < r){
			
			for(int i=l;i<r;i++){
				System.out.print(matrix[t][i]+" ");
			}
			t++;
			
			for(int i=t;i<d;i++){
				System.out.print(matrix[i][r-1]+" ");
			}
			r--;
			
			if(t < d){
				for(int i=r-1;i>=l;i--){
					System.out.print(matrix[d-1][i]+" ");
				}
				d--;
			}
			
			if(l < r){
				for(int i=d-1;i>=t;i--){
					System.out.print(matrix[i][l]+" ");
				}
				l++;
			}
		}
	}
}
