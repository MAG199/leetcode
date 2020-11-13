//Time Complexity: O(log n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes


/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */

class Solution {
    public int search(ArrayReader reader, int target) {
        int slow = 0;
        int fast = 1;
        // while(slow<=fast){
        //loop till you find the target to be inside the range of slow and fast pointer then perform binary search
            while(reader.get(fast)<target){
                slow = fast;
                fast = 2*fast;
//             if(reader.get(slow)<=target && reader.get(fast)>target){
//                 return binarySearch(reader, target, slow, fast);

//             }


        }
        return binarySearch(reader, target, slow, fast);
    }

    public int binarySearch(ArrayReader reader, int target, int slow, int fast){

        while(slow<=fast){
            int mid = slow + (fast-slow)/2;
        if(reader.get(mid)==target){
            return mid;
        }
        else if(reader.get(mid)>target){
            fast = mid-1;
        }
        else{
            slow = mid+1;
        }
    }
        return -1;
    }
}
