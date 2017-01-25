
/**
 * @author ssm
 *https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int curr = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    curr = 4;
                    if(i > 0 && grid[i-1][j] == 1){
                        curr--;
                    }
                    if(j > 0 && grid[i][j-1] == 1){
                        curr--;
                    }
                    if(i<grid.length-1 && grid[i+1][j] == 1){
                        curr--;
                    }
                    if(j<grid[i].length-1 && grid[i][j+1] == 1){
                        curr--;
                    }
                    perimeter += curr;
                }
            }
        }
        return perimeter;
    }
}
