//Time Complexity: O(2n) = O(n)
//Space Complexity: O(2n)
// Did this code successfully run on Leetcode: Yes

import java.io.*;
import java.util.*;

class MinStack {
    Stack<Integer> t = new Stack<>();
    int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(x<=min){
            t.push(min);
            min = x;
        }
        t.push(x);
    }

    public void pop() {
        if(t.pop()==min){
            min = t.pop();
        }
    }

    public int top() {
        return t.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
