/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */

package Arrays;
import java.util.*;
public class Q21 {
    
}

class Solution_Q21 {                                                    //Runtime : 5ms
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int element : nums){
            l1.add(element);
        }
        Arrays.sort(nums);
        int i = 0, j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] > target){
                j--;
            }
            else if(nums[i] + nums[j] < target){
                i++;
            }
            else{
                ans[0] = l1.indexOf(nums[i]);
                ans[1] = l1.lastIndexOf(nums[j]);
                return ans;
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }
}

class Solution2 {                                               //Runtime : 77ms
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int toFind = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(toFind == nums[j]){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}