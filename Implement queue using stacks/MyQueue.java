// Time Complexity: O(n)
// Space Complexity: O(2n)
// Did this code successfully run on Leetcode: Yes

import java.io.*;
import java.util.*;
  
class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        st1.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        }
        // while(!st2.isEmpty()){
        //     st1.push(st2.pop());
        // }

        return st2.pop();

    }

    /** Get the front element. */
    public int peek() {
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        }
        // while(!st2.isEmpty()){
        //     st1.push(st2.pop());
        // }

        return st2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }
        else{
            return false;
        }

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
