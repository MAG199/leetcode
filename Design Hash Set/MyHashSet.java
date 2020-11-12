// TC: Add: O(1), Remove: O(1), Contains: O(1)
//  Explanation: create an array of 10^n/2 space, while performing the add operation
// if the array at index is not created, first create the array and make the particular
// position true, for remove, check if the array at index is created, if it is not return,
// if it is make sure to enter false at the particular position and finally, for contains
// follow the steps similar to remove instead of remove, if element present at position return true.

class MyHashSet {
    boolean[][] n;
    int n2 = 1000;
    /** Initialize your data structure here. */
    public MyHashSet() {
        n = new boolean[1000][];
    }

    public void add(int key) {
        int mod = key%1000;
        int pos = key/1000;
        if(n[mod] == null){

            n[mod] = new boolean[n2];

        }
        n[mod][pos] = true;
    }

    public void remove(int key) {
        int mod = key%1000;
        int pos = key/1000;
        //if the below code is not added, when there is no array created, will throw null pointer exception
         if(n[mod]==null){
            return;
        }
        if(n[mod][pos]==true){
            n[mod][pos]=false;
        }

    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        // null pointer exception
        // int mod = key%1000;
        // int pos = key/1000;
        // if(n[mod][pos]==1){
        //     return true;
        // }
        // return false;

        int mod = key%1000;
        int pos = key/1000;
        //if the below code is not added, when there is no array created, will throw null pointer exception
        if(n[mod]==null){
            return false;
        }
        // System.out.println(n[mod][pos]);
        return n[mod][pos];

    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
