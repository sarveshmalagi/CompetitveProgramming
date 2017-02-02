import java.util.Stack;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/implement-queue-using-stacks/
public class MyQueue {
    Stack s1,s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int ret_val = (int)s2.pop();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return ret_val;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        int ret_val = (int)s2.peek();
        while(!s2.empty()){
            s1.push(s2.pop());
        }
        return ret_val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */