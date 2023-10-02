/*Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
 */

package Sorting;
import java.util.*;
public class MaxProdThreeNumb {
    
}
class Solution_MaxProdThreeNumb_1 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int product1 = 1;
        int product2 = 1;
        product1 *= nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        product2 *= nums[0]*nums[1]*nums[nums.length-1];
        int max = product1;
        if(product2 > max){
            max = product2;
        }
        return max;
    }
}