/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs,(a,b)->Integer.compare(a.length(), b.length()));
        String output = "";

        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i)==(strs[strs.length-1].charAt(i))) {
                output+=strs[0].charAt(i);
            }else{
                break;
            }
        }

        System.out.println(output);
    
    }   
}

