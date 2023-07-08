/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 */

package Searching;
import java.util.*;
public class IntersectionTwoArrays {
    
}
class Solution_IntersectionTwoArrays_1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int elements : nums1){
            h1.add(elements);
        }
        for(int elements : nums2){
            h2.add(elements);
        }
        ArrayList<Integer> arr = new ArrayList<>(h2);
        ArrayList<Integer> arr2 = new ArrayList<>(); 
        for(int i = 0; i < h2.size(); i++){
            if(!(h1.add(arr.get(i)))){
                arr2.add(arr.get(i));
            }
        }
        int[] ans = new int[arr2.size()];
        for(int i = 0 ; i < arr2.size() ; i++){
            ans[i] = arr2.get(i);
        }
        return ans;
    }
}