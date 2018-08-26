//Given a sorted (in ascending order) integer array nums of n elements and a target value, write a function to search target in nums. 
//If target exists, then return its index, otherwise return -1.
// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4

// You may assume that all elements in nums are unique.
// n will be in the range [1, 10000].
// The value of each element in nums will be in the range [-9999, 9999].

//linear search
class Solution {
    public int search(int[] nums, int target) {
        for(int i = 0; i <= nums.length; i++){
          if(nums[i] == target){
            return i;
          } 
        }
      return -1;
    }
}


// binary search solution
// Binary search works on sorted arrays. Binary search begins by comparing the middle element of the array with the target value. 
// If the target value matches the middle element, its position in the array is returned. If the target value is less than the middle element, 
// the search continues in the lower half of the array. If the target value is greater than the middle element, the search continues in the 
// upper half of the array. By doing this, the algorithm eliminates the half in which the target value cannot lie in each iteration.



class Solution {
    public int search(int[] nums, int target) {
      int middle = nums.length/2;
      int endIndex = nums.length;
      int left = nums[0] ;
      int right =nums[middle+1] ;  
      for(int i = 0; i <= nums.length; i++){
        if(target == middle){
          return middle;
        } else if(target > middle){
         // search(nums[middle endindex];/2, target) 
         
          
          
        } else{
         
          
        }
      }
   }
}
middle+ end/2  

[1 ,2 ,3,4 ,5,6,7,8,9,10]




[0,1,2,3,7,8,59,56,52,202 ,304 ,567 ,777 ,3234]
