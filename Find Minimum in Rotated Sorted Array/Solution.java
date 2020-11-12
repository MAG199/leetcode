//TC: O(n)
// SC: O(n)
// Explaination: iterate through each element update the min as you come across smaller element
class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<min){
                    min = nums[i];
                }
        }
        return min;
    }
}
