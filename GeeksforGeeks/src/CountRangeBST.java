class CountRangeBST{
	int getCountOfNode(NodeBST root, int low, int high) {
	        if(root == null){
	            return 0;
	        }
	        
	        if(root.data >= low && root.data <= high){
	            return 1+getCountOfNode(root.left,low,high)+getCountOfNode(root.right,low,high);
	        }
	        else if(root.data < low){
	            return getCountOfNode(root.right,low,high);
	        }
	        else{
	            return getCountOfNode(root.left,low,high);
	        }
	    }
}