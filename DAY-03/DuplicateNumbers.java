/*Problem Statement: Given an array of N + 1 size, where each element is between 1 and N. Assuming there is only one duplicate number, your task is to find the duplicate number. */

/*
Example 1: 

Input: arr=[1,3,4,2,2]

Output: 2

Explanation: Since 2 is the duplicate number the answer will be 2.

Example 2:

Input: [3,1,3,4,2]

Output:3

Explanation: Since 3 is the duplicate number the answer will be 3.*/

/*import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Finding the duplicate number in the array
        int repeating = -1;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                repeating = i;
            }
        }
        System.out.println("The duplicate is" + repeating);
    }
}*/



//Hashing

/*import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Finding the duplicate number in the array
        int freq[] = new int[n+1];
        int repeating = -1;
        for (int i = 0; i < n; i++) {
            //Precompute and store the elements
            freq[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            //Precompute and store the elements
            if(freq[i]==2){
                repeating=i;
            }
        }
        System.out.println("The duplicate is" + repeating);
        }
       
    }*/

    
    //Collections
    import java.util.*;

    public class DuplicateNumbers {

        public static int FrequencyCount(int arr[], int n){
            int repeating = -1;
            HashMap<Integer,Integer> maps = new HashMap<>();
            for(int i=0;i<n;i++){
               maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
            }
            for(int i=0;i<n;i++){
                if(maps.getOrDefault(i,0)==2){
                    repeating = i;
                }
            }
            return repeating;
        }
          public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }
          int answer = FrequencyCount(arr, n);
          System.out.println("The Duplicate number is "+answer);
          sc.close();
      }
    }