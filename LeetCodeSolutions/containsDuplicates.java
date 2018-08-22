// // Given an array of integers, find if the array contains any duplicates.
// // Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
// Input: [1,2,3,1]
// Output: true
import java.util.Map;
import java.util.Hashmap;
//Brute force approach => O(n^2)
class Solution {
    public boolean containsDuplicate(int[] nums) {
    	for(int i = 0; i <= nums.length; i++){
        for(int j=0; j <= nums.length; j++){
        	 if(nums[i] == nums[j]){
          	return true;
        	}
        }
      }
        return false;
  }
}

[1,2,3,1]

	  0 1 2 3
	  i
0 j 1 2 3 1
1	
2
3
// // Given an array of integers, find if the array contains any duplicates.
// // Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
// Input: [1,2,3,1]
// Output: true
import java.util.*;


//Hashmap
//0(n) complexity 
class Solution {
  //hashmap => key => value inside index 
  					// value=> count
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
      for(int i = 0; i <= nums.length; i++){
        map.put(i, nums[i]);
        if(map.containsValue(i)){
          return true;
        }  
      }
      return false;
    }
}
// boolean containsKey(Object key): Used to return True if for a specified key, mapping is present in the map.
// boolean containsValue(Object value): Used to return true if one or more key is mapped to a specified value.

//if(map.containsValue(nums[i]) > 1)

// //[1,2,3,1]
// key => 1 value => 1
// key => 2 value => 1
// key => 3 value => 1
// key => 1 value => 1
  
// // map.put("vishal", 10);
//   map.put(nums[i], 1);
//   map.containsValue(1);



