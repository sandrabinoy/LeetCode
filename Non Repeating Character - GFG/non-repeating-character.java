// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int[] charCount = new int[26];
        for (int ch = 0; ch < S.length(); ch++) {
            charCount[S.charAt(ch) - 'a']++;
        }
        
        for (int ch = 0; ch < S.length(); ch++) {
            if (charCount[S.charAt(ch) - 'a'] == 1) {
                return S.charAt(ch);
            }
        }
        return '$';
    }
}

