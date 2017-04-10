
/**
 * @author ssm
 *
 */
public class FriendCircle {
	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet(5);
		
		ds.union(0, 2);
		ds.union(4, 2);
		ds.union(3, 1);
		
		if (ds.find(4) == ds.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        // Check if 1 is a friend of 0
        if (ds.find(1) == ds.find(0))
            System.out.println("Yes");
        else
            System.out.println("No");
	}
}

class DisjointSet{
	int[] parent,rank;
	int n;
	
	public DisjointSet(int n){
		this.n = n;
		parent = new int[n];
		rank = new int[n];
		makeSet();
	}
	
	public void makeSet(){
		for(int i=0;i<n;i++){
			parent[i] = i;
		}
	}
	
	int find(int x){
		if(parent[x] != x){
			int p = find(parent[x]);
			parent[x] = p;
		}
		return parent[x];
	}
	
	void union(int x,int y){
		
		int root_x = find(x);
		int root_y = find(y);
		
		if(root_x == root_y){
			return;
		}
		
		if(rank[root_x] < rank[root_y]){
			parent[root_x] = root_y;
		}
		else if(rank[root_x] > rank[root_y]){
			parent[root_y] = root_x;
		}
		else{
			parent[root_y] = root_x;
			rank[root_x]++;
		}
	}
}