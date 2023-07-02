/*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

 

Example 1:

*
**
**

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:

*
**
***
**

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 

Constraints:

1 <= n <= 231 - 1 */

package Searching;

public class ArrangingCoins {
    
}
class Solution_ArrangingCoins {
    public int arrangeCoins(int n) {
        long mSum = (long)2*n;                     //modified sum comes from 2n = i(i+1)
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if((long)mid*(mid+1) == mSum){
                return mid;
            }
            if((long)mid*(mid+1) > mSum){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}