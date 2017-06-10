
/**
 * @author ssm
 *
 */
/*
Pairwise swap a linked list
The input list will have at least one element  
node is defined as */

public class PairwiseSwapLL {

	void pairWiseSwap(Node head)
	{
	    Node temp = head;
	
	    /* Traverse only till there are atleast 2 nodes left */
	    while (temp != null && temp.next != null) {
	
	        /* Swap the data */
	        int k = temp.data;
	        temp.data = temp.next.data;
	        temp.next.data = k;
	        temp = temp.next.next;
	     }
	}
}