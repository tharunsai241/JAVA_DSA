//reverse the string and reverse word of a string

/*import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();

        int low =0;
        int high = str.length-1;
        while(low<high){
            //Swapping characters
            char temp = str[low];
            str[low]=str[high];
            str[high]=temp;
            low++;
            high--;
        }
        System.out.println("Reverse String is "+new String(str));
    }
}*/

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words=str.split(" ");

        int low = 0;
        int high = words.length - 1;
        while (low < high) {
            // Swapping characters
            String temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }

        String revseString = String.join(" ",words);
        System.out.println("Reverse String is " + revseString);
    }
}