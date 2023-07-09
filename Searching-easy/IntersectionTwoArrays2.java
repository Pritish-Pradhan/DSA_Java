/*Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
 

Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */

package Searching;
import java.util.*;
public class IntersectionTwoArrays2 {
    
}
class Solution_IntersectionTwoArrays2_1 {                                       //has a bad time-space complexity
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1 = new ArrayList<>();          //list of nums2
        for(int i = 0; i < nums2.length; i++){
            l1.add(nums2[i]);
        }
        ArrayList<Integer> aList = new ArrayList<>();       //list of final answer
        for(int i = 0; i < nums1.length; i++){
            if(l1.contains(nums1[i])){
                aList.add(nums1[i]);                    //add the intersection element to list
                l1.remove(l1.indexOf(nums1[i]));        //removing that element from nums2
            }
            if(l1.size() == 0){
                break;
            }
        }
        int[] arr = new int[aList.size()];                  //converting answer list to array
        for(int i = 0; i < aList.size(); i++){
            arr[i] = aList.get(i);
        }
        return arr;
    }
}
class Solution_IntersectionTwoArrays2_2 {                           //time : 2ms beats 95.83%
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                l1.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] arr = new int[l1.size()];
        for(int k = 0; k < l1.size(); k++){
            arr[k] = l1.get(k);
        }
        return arr;
    }
}