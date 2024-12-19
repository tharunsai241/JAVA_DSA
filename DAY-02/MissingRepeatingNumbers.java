//Missing and Repeating Numbers

/*
 * Problem Statement: You are given a read-only array of N integers with values
 * also in the range [1, N] both inclusive. Each integer appears exactly once
 * except A which appears twice and B which is missing. The task is to find the
 * repeating and missing numbers A and B where A repeats twice and B is missing.
 */

 /*
  * Example 1:
  * Input Format
  * : array[] = {3,1,2,5,3}
  * Result
  * : {3,4)
  * Explanation
  * : A = 3 , B = 4
  * Since 3 is appearing twice and 4 is missing
  * 
  * Example 2:
  * Input Format
  * : array[] = {3,1,2,5,4,6,7,5}
  * Result
  * : {5,8)
  * Explanation
  * : A = 5 , B = 8
  * Since 5 is appearing twice and 8 is missing
  */

  //Brute Force
  //Hashing
  //Collections

  //Brute force

/*import java.util.Scanner;

public class MissingRepeatingNumbers{

    public static int[] FrequencyCount(int arr[], int n) {
        int missing = -1, repeating = -1;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                missing = i;

            } else if (cnt == 2) {
                repeating = i;
            }
        }
        return new int[] { repeating, missing };
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] answer = FrequencyCount(arr,n);
        System.out.println("{"+ answer[0] +","+answer[1]+"}");
        sc.close();
    }
  }*/

   
  //Frequency Array {Hashing}

  /*import java.util.Scanner;

  public class MissingRepeatingNumbers {

      public static int[] FrequencyCount(int arr[], int n) {
          int freqarr[] = new int[n+1];
          int missing =-1,repeating=-1;
          for (int i = 0; i < n; i++) {
              freqarr[arr[i]]++; //Precomputing and storing the value occurences in FreqArray
          }
          for(int i=1;i<=n;i++){
            if(freqarr[i]==0){
                missing = i;
            }
            else if (freqarr[i]==2){
                repeating = i; 
            }
          }
          int ans [] = {repeating,missing};
          return ans;

      }

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }
          int[] answer = FrequencyCount(arr, n);
          System.out.println("{" + answer[0] + "," + answer[1] + "}");
          sc.close();
      }
  }*/

  //Collections

  import java.util.HashMap;
import java.util.Scanner;


  public class MissingRepeatingNumbers {

      public static int[] FrequencyCount(int arr[], int n) {
          int missing = -1, repeating = -1;

          HashMap<Integer,Integer> map = new HashMap<>();

          for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1); //Here incrementing the count if the value is 1st time and adding 1 for occurence
          }

          for(int i=1;i<=n;i++){
            if(map.getOrDefault(i, 0)==0){
                missing = i;
            }
            else if(map.getOrDefault(i,0)==2){
                repeating = i;
            }
          }
          return new int[] { repeating, missing };
      }

      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int arr[] = new int[n];
          for (int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
          }
          int[] answer = FrequencyCount(arr, n);
          System.out.println("{" + answer[0] + "," + answer[1] + "}");
          sc.close();
      }
  }