//TC: O(n)
//SC: O(1)
//Explanation: compared current element with previous and next element to find if current index is peak //or not
class Solution {
    public int findPeakElement(int[] nums) {
        // int[] index = new int[nums.length-1];
        // List<Integer> index = new ArrayList<Integer>();
        int curr;
        int prev;
        int next;
        // int max=0;
        //base condition: if no elements/1 element/ 2 elements and element1>element2
        if(nums==null||nums.length==0||nums.length==1||nums[0]>nums[1]){
            return 0;
        }
        //peak condition: when element2>element1
        int n=nums.length;
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }

        for(int i=1;i<nums.length-1;i++){
            prev=nums[i-1];
            curr=nums[i];
            next=nums[i+1];

            if(curr>prev && curr>next){
                // index.add(i);
                // if(nums[i])
                return i;
            }
            else{
                continue;
            }

        }
//         int[] toIntArray(List<Integer> list)  {
//         int[] ret = new int[list.size()];
//         int i = 0;
//         for (Integer e : list)
//              ret[i++] = e;
//         return ret;
//      }

//         int[] ret = new int[index.size()];
//         int i=0;
//         for(Integer e: index){
//             ret[i++] = e;
//         }
//         int max=0;

//         for(int j=0;j<ret.length;j++){
//             if(ret[j]>max){
//                 max=ret[j];
//             }
//         }
        return -1;



    }
}
