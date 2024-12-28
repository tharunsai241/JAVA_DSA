//Palindrome of a string

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
          int low = 0;
          int high = str.length()-1;
          while(low<high){
            if(str.charAt(low)==str.charAt(high)){
                low++;
                high--;
            }
            else{
                System.out.println("Not Palindrome");
                return;
            }
          }
          System.out.println("Palindrome");
    }
}