/*Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

package Arrays;
import java.util.*;
public class Q7 {
    
}
class Solution_Q7 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int i = 0, j = nums.length - 1;
        Arrays.sort(nums);
        while(i < j){
            if(nums[i] == nums[j]){
                count++;
            }
            j--;
            if(j == i){
                j= nums.length-1;
                i++;
            }
        }
        return count;
    }
}