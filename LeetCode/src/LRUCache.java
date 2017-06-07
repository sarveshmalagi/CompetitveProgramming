import java.util.HashMap;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/lru-cache/#/description

class Node {
    int key;
    int value;
    Node pre;
    Node next;

    public Node(int key, int value) {
	    this.key = key;
	    this.value = value;
    }
}

public class LRUCache {
    Node head,tail;
    HashMap<Integer,Node> hm;
    int capacity,count;
    
    public LRUCache(int capacity) {
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.pre = head;
        head.pre = null;
        tail.next = null;
        hm = new HashMap<Integer,Node>();
        this.capacity = capacity;
        count = 0;
    }
    
    public void deleteNode(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
    
    public void addFront(Node node){
        node.next = head.next;
        node.next.pre = node;
        node.pre = head;
        head.next = node;
    }
    
    public int get(int key) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            int res = node.value;
            deleteNode(node);
            addFront(node);
            return res;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            node.value = value;
            deleteNode(node);
            addFront(node);
        }
        else{
            Node node = new Node(key,value);
            hm.put(key,node);
            if(count < capacity){
                count++;
                addFront(node);
            }
            else{
                hm.remove(tail.pre.key);
                deleteNode(tail.pre);
                addFront(node);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */