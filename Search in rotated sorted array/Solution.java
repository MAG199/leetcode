//Brute Force
//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes

class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            // else{
            //     continue;
            // }
        }
        return -1;
    }
}
