
//Kadane's Algorithm : Maximum Subarray Sum in an Array


//Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
//has the largest sum and returns its sum and prints the subarray.


/*Example 1:Input:arr=[-2,1,-3,4,-1,2,1,-5,4]

Output:6

Explanation:[4,-1,2,1]has the largest sum=6.

Examples 2:Input:arr=[1]

Output:1

Explanation:Array has only one element and which is giving positive sum of 1. */

// import java.util.Scanner;

// public class KadensAlgorithm {
//         public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Array Size");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the Array elements");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         //Kadens Algorithm
//         int current_sum = arr[0];
//         int farsum=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(current_sum+arr[i]>current_sum){
//                 current_sum = current_sum+arr[i];
//             }
//             else{
//                 current_sum = arr[i];
//             }
//             if (current_sum > farsum) {
//                 farsum = current_sum;
//             }
//         }
//         System.out.println("the maximum subarray is"+farsum);
//     }
// }



import java.util.*;
import java.util.Scanner;

public class KadensAlgorithm{
    public static void main(String args[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        int count = sc.nextInt();

        for(int i=0;i<count;i++){
            int num = sc.nextInt();
            numbers.add(num);
        }

        //Kaden's Algorithm
        int current_sum = numbers.get(0);
        int farsum = numbers.get(0);
        for(int i=1;i<numbers.size();i++){
            if(current_sum+numbers.get(i) > numbers.get(i)){
                current_sum=current_sum+numbers.get(i);
            }
            else{
                current_sum=numbers.get(i);
            }
            if(current_sum>farsum){
                farsum=current_sum;
            }
        }
        System.out.println("The maximum subarray is"+ farsum);

        sc.close();
    }
}