class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        //     // else{
        //     //     continue;
        //     // }
        // }
        // return -1;
        int start = 0;
        int end = nums.length - 1;
        int value = binarySearch(nums, target, start, end);
        return value;
    }

    public int binarySearch(int[] nums, int target, int start, int end){

        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            //right side is sorted or not
             // else if (nums[mid]<end) make sure number or index to be considered
            else if (nums[mid]<nums[end]){
            //target present on right or not
            if(nums[mid]<target && nums[end] >= target){
            // binarySearch(nums, target, mid+1, end);
            start = mid+1;
        }
            else{
                // binarySearch(nums, target, start, mid-1);
                end=mid-1;
            }
        }
        else{
            if(nums[mid]>target && nums[start] <= target){
            // binarySearch(nums, target, start, mid-1);
                end = mid-1;
        }
            else{
                // binarySearch(nums, target, mid+1, end);
                start = mid+1;
            }
        }
    }
         return -1;
}
}
