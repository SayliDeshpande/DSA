class Solution {
  
  //Approach #1 (Naive Linear Search)  O(nˆ2) & O(1).
  /*
  public boolean containsDuplicate(int[] nums) {
    for (int i = 0; i < nums.length; ++i) {
        for (int j = 0; j < i; ++j) {
            if (nums[j] == nums[i]) return true;  
        }
    }
    return false;
  }
  */
  // Approach #2 (Sorting) O(nlogn) & O(1). Sorting is O(nlog⁡n) & sweeping is O(n). The entire algorithm is dominated by sorting step, which is O(nlog⁡n)
  /*
  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] == nums[i + 1]) return true;
    }
    return false;
  }
  */
  // Approach #3 (Hash Table) :  O(n) : We do search() and insert() for nnn times and each operation takes constant time. & O(1)
  
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int n : nums){
           if(!set.add(n)) return true;
       }
       return false;
    }
}

// Next variation : 219. Contains Duplicate II
// Approach : Hash Table
/*Algorithm : 
Loop through the array, for each element do
Search current element in the HashTable, return true if found
Put current element in the HashTable
If the size of the HashTable is larger than kkk, remove the oldest item.
Return false */
//Time complexity : O(n). We do nnn operations of search, delete and insert, each with constant time complexity.
//Space complexity : O(min⁡(n,k))
//The extra space required depends on the number of items stored in the hash table, which is the size of the sliding window, min⁡(n,k)
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; ++i) {
        if (set.contains(nums[i])) return true;
        set.add(nums[i]);
        if (set.size() > k) {
            set.remove(nums[i - k]);
        }
    }
    return false;
}
