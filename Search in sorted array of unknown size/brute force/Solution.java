//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes

/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

import java.io.*;
import java.util.*;

class Solution {
    public int search(ArrayReader reader, int target) {
        for(int i=0;i<10000;i++){
            // if(ArrayReader.get(i)==target)Error: non static method cannot be referenced from a static context [duplicate]
            if(reader.get(i)==target){
                return i;
            }
            else{
                continue;
            }
        }
        return -1;
    }
}
