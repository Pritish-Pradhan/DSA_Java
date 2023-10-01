/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
 */

package Sorting;
import java.util.*;
public class MajorityElement {
    
}
class Solution_MajorityElement_1 {                                        //not an efficient program
    public int majorityElement(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            boolean swapped = false;
            for(int j = 0; j < nums.length - i - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        int count = 1;
        int freq = nums.length/2;
        for(int  j = 1; j < nums.length; j++){
            if(nums[j] == nums[j-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > freq){
                return nums[j];
            }
        }
        return nums[0];             //for array of size 1
    }    
}
class Solution_MajorityElement_2 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int freq = nums.length/2;
        for(int  j = 1; j < nums.length; j++){
            if(nums[j] == nums[j-1]){
                count++;
            }
            else{
                count = 1;
            }
            if(count > freq){
                return nums[j];
            }
        }
        return nums[0];             //for array of size 1
    }    
}

class Solution_MajorityElement_3 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }    
}