/*Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.

A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 

Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.
 */

package Arrays;
import java.util.*;
public class Q23 {
    
}
//It is the same as creating a list/array of min in row and another list/array of max in column and checking which number is common
class Solution_Q23 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> minRow = new ArrayList<>();
        ArrayList<Integer> maxCol = new ArrayList<>();
        int row = matrix.length, col = matrix[0].length;
        //for row
        for(int i = 0; i < row; i++){
            int min = matrix[i][0];
            for(int j = 0; j < col; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
            }
            minRow.add(min);
        }
        // for column
        for(int i = 0; i < col; i++){
            int max = matrix[0][i];
            for(int j = 0 ; j < row; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            maxCol.add(max);
        }
        //updating the list to store only the common elements in both the collection
        maxCol.retainAll(minRow);
        return maxCol;
    }
}

//Brute force method or this would have worked fine if the question would not have specified that all its elements does not have to be distinct
class Solution_Q23_2 {                                                              //Runtime : 6ms
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ; i++){
            int min = matrix[i][0];
            for(int j = 0 ; j < matrix[i].length ; j++){    //for minimum in row
                l.add(matrix[i][j]);
                min = Math.min(min,matrix[i][j]);
            }
            int x = l.indexOf(min);
            int max = 0;
            for(int k = 0 ; k < matrix.length ; k++){       //for maximum in column
                max = Math.max(min,matrix[k][x]);
                if(max != min){
                    break;
                }
            }
            if(min == max){
                l1.add(min);
            }
            l.clear();
        }
        return l1;
    }
}
