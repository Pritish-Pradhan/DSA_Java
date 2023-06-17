/*Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.

 

Example 1:


Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:


Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
 

Constraints:

n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.
 */

package Arrays;
import java.util.*;
public class Q20 {
    
}
class Solution_Q20 {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target)){
            return true;
        }
        
        int[][] rotation = new int[mat.length][mat.length]; //rotate 90
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                rotation[i][j] = mat[mat.length-j-1][i];
            }
        }
        if(Arrays.deepEquals(rotation,target)){
            return true;
        }
        
        int[][] rotation2 = new int[mat.length][mat.length]; //rotate again 90
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                rotation2[i][j] = rotation[mat.length-j-1][i];
            }
        }
        if(Arrays.deepEquals(rotation2,target)){
            return true;
        }
        
        int[][] rotation3 = new int[mat.length][mat.length]; // rotate again 90
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                rotation3[i][j] = rotation2[mat.length-j-1][i];
            }
        }
        if(Arrays.deepEquals(rotation3,target)){
            return true;
        }
        return false;
    }
}

class Solution_Q20_2 {
    public boolean findRotation(int[][] mat, int[][] target) {
        int[][] arr = new int[mat.length][mat.length];

        //rotating 0 or 360 degree
        if(Arrays.deepEquals(mat,target)){
            return true;
        }

        //rotating 90 degree
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                arr[i][j] = mat[mat.length-j-1][i];      
            }
        }
        if(Arrays.deepEquals(arr,target)){
            return true;
        }

        //rotating 180 degree
        int[][] arr2 = new int[mat.length][mat.length];
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                arr2[i][j] = mat[mat.length-i-1][mat.length-j-1];      
            }
        }
        if(Arrays.deepEquals(arr2,target)){
            return true;
        }

        //rotating 270 degree
        int[][] arr3 = new int[mat.length][mat.length];
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                arr3[i][j] = mat[j][mat.length-i-1];      
            }
        }
        if(Arrays.deepEquals(arr3,target)){
            return true;
        }
        return false;
    }
}