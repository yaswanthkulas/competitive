// LeetCode link - "https://leetcode.com/problems/longest-common-prefix/" #Easy
/* Write a function to find the longest common prefix string amongst an array of strings.

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
strs[i] consists of only lower-case English letters.*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int len=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++)
        {
            len=Math.min(len,strs[i].length());
        }
        
        String res ="";
        outerloop:
        for(int i=0;i<len;i++)
        {
            char c=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(c!=strs[j].charAt(i))
                {
                    break outerloop;
                }
            }
            
            res=res+c;
        }
        
        return res;
        
    }
}
