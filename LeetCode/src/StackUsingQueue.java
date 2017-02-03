import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ssm
 *
 */
//https://leetcode.com/problems/implement-stack-using-queues/
public class StackUsingQueue {
	Queue q1,q2;
    /** Initialize your data structure here. */
    public StackUsingQueue() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    /*Make the pop() operation costly
     *can be further optimized */
    public int pop() {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int ret_val = (int)q1.remove();
        while(q2.size() > 0){
            q1.add(q2.remove());
        }
        return ret_val;
    }
    
    /** Get the top element. */
    public int top() {
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        int ret_val = (int)q1.remove();
        q2.add(ret_val);
        while(q2.size() > 0){
            q1.add(q2.remove());
        }
        return ret_val;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
