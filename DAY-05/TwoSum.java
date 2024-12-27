/*Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is 'YES' for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target. */


/*import java.util.Scanner;

public class TwoSum{
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
        boolean answer = FindTwoSum(arr,n,target); 
        if(answer==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    //Two Sum brute force
    static boolean FindTwoSum(int arr[],int n,int target){
        for (int i=0;i<n;i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}*/


//Optimal - Using Two pointers
/*import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean answer = FindTwoSum(arr, n, target);
        if (answer == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Two Sum brute force
    static boolean FindTwoSum(int arr[], int n, int target) {
        int low =0;
        int high = n-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                return true;
            }
            else if(arr[low]+arr[high]<target){
                low++;
            }
            else {
                high--;
            }
        }
        return false;
    }
}*/




import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            numbers.add(input);
        }
        int target = sc.nextInt();
        boolean answer = FindTwoSum(numbers, n, target);
        if (answer == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    static boolean FindTwoSum(ArrayList<Integer> numbers, int n, int target) {
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int sum = numbers.get(low)+numbers.get(high);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return false;
    }

}