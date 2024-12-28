/*Problem Statement: Given a String, find the length of longest substring without any repeating character. */

/*Example 1:

Input: s = ”abcabcbb”

Output: 3

Explanation: The answer is abc with length of 3.

Example 2:

Input: s = ”bbbbb”

Output: 1

Explanation: The answer is b with length of 1 units. */

import java.util.Scanner;

public class LongestSubStringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); //Read String

        //Empty String
        
        String subString = "";
        String longestSubString = "";
        int maxLength = 0;

        for(int i=0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(subString.indexOf(currentChar)!=-1){
                subString = subString.substring(subString.indexOf(currentChar)+1);
            }
            subString+=currentChar;
            if(subString.length()>maxLength){
                maxLength = subString.length();
                longestSubString = subString;
            }
        }
        System.out.println("The longest substring without repeating characters is: " + longestSubString);
        System.out.println("The length is"+maxLength);
        sc.close();
    }   
}
