/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters. */

package Arrays;

public class Q10 {
    
}
class Solution_Q10 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        int[] index = new int[26];
        for(int i = 0; i < 26; i++){
            index[i] = sentence.indexOf((char)(i + 97));
        }
        for(int element : index){
            if(element < 0){
                return false;
            }
        }
        return true;
    }
}