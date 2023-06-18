/*Given an integer n, return any array containing n unique integers such that they add up to 0.

 

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]
 

Constraints:

1 <= n <= 1000 */

package Arrays;

public class Q22 {
    
}
class Solution_Q22 {
    public int[] sumZero(int n) {
        int[] nums = new int[n];
        for(int i = 0; i < n-1 ; i += 2){
            nums[i] = i+1;    
            nums[i+1] = -(i+1);
        }
        return nums;
    }
}