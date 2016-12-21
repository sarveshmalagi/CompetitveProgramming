import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 We define a series as follows:

We define a Hackonacci Matrix to be an matrix where the rows and columns are indexed from to , and the top-left cell is . Each cell must contains either the character X or the character Y. If is even, it's X; otherwise, it's Y.

Next, we want to perform queries where each query consists of an integer, . Each is a multiple of degrees and describes the angle by which you must rotate the matrix in the clockwise direction. For each , we want to count the number of cells that are different after the rotation. For example, the diagram below depicts the rotation of a Hackonacci Matrix when :

image

As you can see, there are two cells whose values change after the rotation. Note that we filled each initial cell using the Hackonacci formula given above:

    :
    Because this is an odd number, we mark this cell with a Y.
    :
    Because this is an even number, we mark this cell with an X.
    :
    Because this is an even number, we mark this cell with an X.
    :
    Because this is an even number, we mark this cell with an X.

Given the value of and queries, construct a Hackonacci Matrix and answer the queries. For each query , print an integer on a new line denoting the number of cells whose values differ from the initial Hackonacci Matrix when it's rotated by degrees in the clockwise direction.

Input Format

The first line contains two space-separated integers describing the respective values of and .
Each line of the subsequent lines contains an integer denoting .

Constraints

    It is guaranteed that each is multiple of degrees.

Output Format

For each , print a single integer on a new line denoting the number of different cells that differ between the initial matrix and the matrix rotated by degrees.

Sample Input 0

4 3
90
180
270

Sample Output 0

10
6
10

 
 */

/**
 * @author sarvesh
 *
 */
/*(0,0)->(3,0) (0,1)->(2,0)*/

public class Hackonacci {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ip1 = br.readLine().split(" ");
		int n = Integer.parseInt(ip1[0]);
		int q = Integer.parseInt(ip1[1]);
		int[] fib = {1,0,1,0,0,1,1};
		char[][] matrix = new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				long fibof = (long)Math.pow((i+1)*(j+1),2);
				int mod = fib[(int)((fibof-1)%7)];
				if(mod == 0)
					matrix[i][j] = 'X';
				else
					matrix[i][j] = 'Y';
			}
		}
        int mul180=-1,mul270=-1,mul90=-1;
		for(int i=0;i<q;i++){
			int query = Integer.parseInt(br.readLine());
			if(query%360 == 0){
				System.out.println("0");
			}
			else if(query%360 == 270){
                if(mul270 == -1){
                    mul270 = compareMatrix(rotateMatrix(matrix,n,-1),matrix,n);
                }
                System.out.println(mul270);
			}
			else if(query%360 == 180){
                if(mul180 == -1){
                    mul180 = compareMatrix(rotateMatrix(rotateMatrix(matrix,n,1),n,1),matrix,n);
                }
                System.out.println(mul180);
			}
			else{
                if(mul90 == -1){
                    mul90 = compareMatrix(rotateMatrix(matrix,n,1),matrix,n);
                }
                System.out.println(mul90);
			}
		}
		
	}
	
	static char[][] rotateMatrix(char mat[][],int n,int times){
		char[][] dest = new char[n][n];
			for (int i=0;i<n;i++){
			   for (int j=0;j<n;j++){
				   if(times == 1)
					   dest[j][n-i-1] = mat[i][j];
				   else
					   dest[n-j-1][i] = mat[i][j];
			   }
			}				
		return dest;
	}
	
	static int compareMatrix(char[][] a,char[][] b,int n){
		int count = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i][j] != b[i][j])
					count++;
			}
		}
		return count;
	}
}
