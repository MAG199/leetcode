// TC:O(logn)
// SC:O(1)
// Explaination: find first element, by checking if there is any element on left side with same value or not,
// if there is same value, perform the search with new size, repeat the same for last element. Make sure to
// obsereve the edge cases, i.e. will get index out of bound error, if used->  if(nums[mid-1]==target) instead of if(mid==0||nums[mid-1]<target)
class Solution {
    public int firstPosition(int[] nums, int target, int start, int end){
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]==target){
                if(mid==0||nums[mid-1]<target){
                    // return firstPosition(nums,target,start,mid-1);
                    return mid;

                }
                else{
                    end=mid-1;
                }
            }

            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return -1;
    }

    public int lastPosition(int[] nums, int target, int start, int end){
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]==target){
                if(mid==nums.length-1||nums[mid+1]>target){
                    // return lastPosition(nums,target,mid+1,end);
                    return mid;
                }
                else{
                    start=mid+1;

                }
            }

            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        // int i=0;
        // int k;
        // boolean check = false;
        // int[] index = new int[2];

        // if(nums.length==1 && nums[0]==target){
        //     index[0]=0;
        //     return index;
        // }

//         while(i<nums.length){
//             if(nums[i]==target && check==false){
//                 index[0]=i;
//                 // k=i+1;

//                 while(nums[i]==target && nums.length>1){
//                     i++;
//                     // count++;
//                 }

//                 if(nums.length>1){
//                     index[1]=i-1;
//                     return index;
//                 }
//                 else{
//                     index[1]=i;
//                     return index;
//                 }


//             }
//             else{
//                 i++;
//             }


//         }
//         index[0]=-1;
//         index[1]=-1;
//         return index;
        int start=0;
        int end=nums.length-1;
        int[] index = new int[2];
        index[0] = firstPosition(nums,target,start,end);
        index[1] = lastPosition(nums,target,start,end);
        return index;
    }
}
