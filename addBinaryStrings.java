/*
Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".
*/

public class Solution {
    public String addBinary(String A, String B) {
        int len1=A.length()-1;
        int len2=B.length()-1;
        int carry =0;
        int sum=0;
        StringBuilder sb = new StringBuilder();
        while(len1>=0 || len2>=0)
        {
            sum=carry;
            if(len1>=0)
            {
                sum=sum+(A.charAt(len1)-'0');
            }

            if(len2>=0)
            {
                sum=sum+(B.charAt(len2)-'0');
            }

            sb.append(sum%2);
            carry = sum/2;
            len1--;
            len2--;
        }

        if(carry!=0)
        {
            sb.append(carry);
        }
        return sb.reverse().toString();


    }
}
