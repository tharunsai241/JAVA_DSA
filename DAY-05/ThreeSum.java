/*3 Sum : Find triplets that add up to a zero


215

5
Problem Statement: Given an array of N integers, your task is to find unique triplets that add up to give a sum of zero. In short, you need to return an array of all the unique triplets [arr[a], arr[b], arr[c]] such that i!=j, j!=k, k!=i, and their sum is equal to zero. 
Example 1: 
Input:
 nums = [-1,0,1,2,-1,-4]

Output:
 [[-1,-1,2],[-1,0,1]]

Explanation:
 Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k*/


/*import java.util.Scanner;

public class ThreeSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        boolean answer = FindThreeSum(arr,n,target); 
        if(answer==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
 
    //Two Sum brute force
    static boolean FindThreeSum(int arr[],int n,int target){
        for (int i=0;i<n;i++) {
            for (int j = i+1; j < n; j++) {
                for(int k=j+1;k<n;k++){
                    if (arr[i] + arr[j]+arr[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}*/

//The above returns only true or false,but not the elements, now the below will returns the elements

/*import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        FindThreeSum(arr, n, target);
        sc.close();
    }

    // Two Sum brute force
    static void FindThreeSum(int arr[], int n, int target) {
        boolean found = false;
        for (int i = 0; i < n-2; i++) {
            int low=i+1,high=n-1;
            while(low<high){
                int sum = arr[i]+arr[low]+arr[high];
                if(sum==target){
                    System.out.println("["+arr[i]+","+arr[low]+","+arr[high]+"]");
                    low++;
                    high--;
                    found=true;
                }
                else if(sum<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        if(!found){
            System.out.println("No Triplets found");
        }
    }
}*/


//Same concept using collections (ArrayList)
import java.util.Scanner;
import java.util.ArrayList;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
           int count = sc.nextInt();
            numbers.add(count);
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        FindThreeSum(numbers, n, target);
        sc.close();
    }

    // Two Sum brute force
    static void FindThreeSum(ArrayList<Integer> numbers, int n, int target) {
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            int low = i + 1, high = n - 1;
            while (low < high) {
                int sum = numbers.get(i)+numbers.get(low)+numbers.get(high);
                if (sum == target) {
                    System.out.println("[" +numbers.get(i) + "," + numbers.get(low) + "," + numbers.get(high) + "]");
                    low++;
                    high--;
                    found = true;
                } else if (sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        if (!found) {
            System.out.println("No Triplets found");
        }
    }
}