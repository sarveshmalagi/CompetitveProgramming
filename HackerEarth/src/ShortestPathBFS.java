//https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/monk-and-the-islands/
/**
 * @author ssm
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShortestPathBFS {
    public static class Graph {
        boolean adjacency[][];
        int size;
        public Graph(int size) {
            this.size = size;
            adjacency = new boolean[size][size];
        }

        public void addEdge(int first, int second) {
            adjacency[first][second] = true;
            adjacency[second][first] = true;
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            int[] distances = new int[size];
            for(int i=0;i<size;i++)
                distances[i] = -1;
            distances[startId] = 0;
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(startId);
            while(!queue.isEmpty()){
                int current = queue.remove();
                for(int i=0;i<size;i++){
                    if(adjacency[current][i] == true){
                        if(distances[i] == -1){
                            distances[i] = distances[current]+1;
                            queue.add(i);
                        }
                    }
                }
            }
            return distances;
        }
        
        public void printGraph(){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.print(adjacency[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
        	String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
        	Graph graph = new Graph(n);
        	for(int j=0;j<m;j++){
        		String[] uv = br.readLine().split(" ");
        		int u = Integer.parseInt(uv[0]) - 1;
        		int v = Integer.parseInt(uv[1]) - 1;
                graph.addEdge(u, v);
        	}
        	int[] distances = graph.shortestReach(0);
        	System.out.println(distances[n-1]);
        }        
    }
}
