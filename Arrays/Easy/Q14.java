/*
There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.

 

Example 1:


Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
Example 2:


Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
 

Constraints:

1 <= m, n <= 50
1 <= indices.length <= 100
0 <= ri < m
0 <= ci < n

*/
package Arrays;
public class Q14 {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int [][] indices = {{1,1},{0,0}};
        Solution_Q14 sol = new Solution_Q14();
        int ans = sol.oddCells(m, n, indices);
        System.out.println(ans);

    }
}

class Solution_Q14 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];    //creating zero-matrix of mxn 
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                mat[i][j] = 0;
            }
        }
        
        //creating increasing matrix
        int row = 0, col = 0;
        for(int i = 0 ; i < indices.length ; i++){//no need for column loop as there is only 0 and 1 column in indices matrix
            row = indices[i][0];            //taking which row to do increment in mat
            col = indices[i][1];            //taking which column to do incerment in mat
            for(int j = 0 ; j < n ; j++ ){  // for row increment
                mat[row][j] += 1;
            }
            for(int j = 0 ; j < m ; j++){   //for column increment
                mat[j][col] += 1;
            }
        }

        //to check odd numbers in the mat matrix after increment
        int count = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] % 2 != 0){
                    count++;
                }
            }
        }

        return count;
    }
}
