/*Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array. */


/*Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]

Explanation:
 Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2:
Input:
 arr[1,1,1,2,2,3,3,3,3,4,4]

Output:
 arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation:
 Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array. */

/*import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateSortedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findDuplicateRemove(arr,n);
        sc.close();
    }
    static void findDuplicateRemove(int arr[], int n){
        HashSet<Integer> numbers = new HashSet<>();
        int index = 0;
        for(int i=0;i<n;i++){
            if(!numbers.contains(arr[i])){
                numbers.add(arr[i]);
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.println("The duplicate elements are");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }
 }*/


import java.util.Scanner;

public class RemoveDuplicateSortedArray {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findDuplicateRemove(arr, n);
        sc.close();
    }

    static void findDuplicateRemove(int arr[], int n){ 
        int index = 0;
        for (int i = 1; i < n; i++) {
            if(arr[index]!=arr[i])
            index++;
            arr[index]=arr[i];
        }
        System.out.println("The duplicate elements are");
        for (int i = 0; i <= index; i++) {
            System.out.println(arr[i]);
        }
    }
}