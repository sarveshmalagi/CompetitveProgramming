
/**
 * @author ssm
 *
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class NonRepeatingChar {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    for(int i=0;i<t;i++){
	        int n=  Integer.parseInt(br.readLine());
	        String[] stream = br.readLine().split(" ");
	        
	        linkedList ll = new linkedList();
	        boolean[] repeated = new boolean[256];
	        DLLNode[] inDLL = new DLLNode[256];
	        
	        for(int j=0;j<n;j++){
	            char c = stream[j].charAt(0);
	            if(!repeated[c]){
	                if(inDLL[c] == null){
	                    DLLNode newNode = ll.insertAtEnd(c);
	                    inDLL[c] = newNode;
	                }
	                else{
	                    repeated[c] = true;
	                    ll.deleteNode(ll.start,inDLL[c]);
	                    inDLL[c] = null;
	                }
	            }
	            System.out.println(ll.start.data);
	        }
	    }
	}
}

class DLLNode{
    public char data;
    public DLLNode next, prev;
    
    DLLNode(){
        next = null;
        prev = null;
        data = 0;
    }

    public DLLNode(char d, DLLNode n, DLLNode p){
        data = d;
        next = n;
        prev = p;
    }

    public void setLinkNext(DLLNode n){
        next = n;
    }

    /* Function to set link to previous node */

    public void setLinkPrev(DLLNode p){
        prev = p;
    }    

    /* Funtion to get link to next node */

    public DLLNode getLinkNext(){
        return next;
    }

    /* Function to get link to previous node */

    public DLLNode getLinkPrev(){
        return prev;
    }

    /* Function to set data to node */

    public void setData(char d){
        data = d;
    }

    /* Function to get data from node */

    public char getData(){
        return data;
    }

}

 

/* Class linkedList */

class linkedList{
    public DLLNode start;
    public DLLNode end ;
    public int size;

 
    public linkedList(){
        start = null;
        end = null;
        size = 0;
    }

    /* Function to check if list is empty */

    public boolean isEmpty(){
        return start == null;
    }

    /* Function to get size of list */

    public int getSize(){
        return size;
    }

    /* Function to insert element at begining */

    public DLLNode insertAtStart(char val){
	DLLNode nptr = new DLLNode(val, null, null);        
        if(start == null){
            start = nptr;
            end = start;
        }
        else{
            start.setLinkPrev(nptr);
            nptr.setLinkNext(start);
            start = nptr;
        }
        size++;
        return nptr;
    }

    public DLLNode insertAtEnd(char val){
	DLLNode nptr = new DLLNode(val, null, null);        
        if(start == null){
            start = nptr;
            end = start;
        }
        else{
            nptr.setLinkPrev(end);
            end.setLinkNext(nptr);
            end = nptr;
        }
        size++;
        return nptr;
    }
        /* Function to delete node at position */

    void deleteNode(DLLNode head_ref, DLLNode del) {
 
        /* base case */
        if (head_ref == null || del == null) {
            return;
        }
 
        /* If node to be deleted is head node */
        if (head_ref == del) {
            head_ref = del.next;
        }
 
        /* Change next only if node to be deleted is NOT the last node */
        if (del.next != null) {
            del.next.prev = del.prev;
        }
 
        /* Change prev only if node to be deleted is NOT the first node */
        if (del.prev != null) {
            del.prev.next = del.next;
        }
 
        /* Finally, free the memory occupied by del*/
        return;
    }
}