
/*Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray. */

/*Example 1:
Input:
 arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output:
 6 

Explanation:
 [4,-1,2,1] has the largest sum = 6. 

Examples 2:
Input:
 arr = [1] 

Output:
 1 

Explanation:
 Array has only one element and which is giving positive sum of 1.  */
 
import java.util.Scanner;

public class MaximumSubArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the Array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        maxSumOfArray(arr, n);
        sc.close();
    }

    static void maxSumOfArray(int arr[], int n){
        int curr_sum = arr[0];
        int far_sum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]+curr_sum > arr[i]){
                curr_sum = arr[i]+curr_sum;
            }
            else{
                curr_sum = arr[i];
            } 
        }
        if (curr_sum > far_sum) {
            far_sum = curr_sum;
        }
        System.out.println("The Maximum SubArray is"+far_sum);
    }
}