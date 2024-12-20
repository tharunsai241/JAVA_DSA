/*Problem statement: Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.*/

/*
 * Example 1:
 * Input:
 * 
 * n = 4, arr1[] = [1 4 8 10]
 * m = 5, arr2[] = [2 3 9]
 * 
 * Output:
 * 
 * arr1[] = [1 2 3 4]
 * arr2[] = [8 9 10]
 * 
 * Explanation:
 * 
 * After merging the two non-decreasing arrays, we get, 1,2,3,4,8,9,10.
 * 
 * Example2:
 * Input:
 * 
 * n = 4, arr1[] = [1 3 5 7]
 * m = 5, arr2[] = [0 2 6 8 9]
 * 
 * Output:
 * 
 * arr1[] = [0 1 2 3]
 * arr2[] = [5 6 7 8 9]
 * 
 * Explanation:
 * 
 * After merging the two non-decreasing arrays, we get, 0 1 2 3 5 6 7 8 9.
 */

 /*import java.util.*;

 public class MergeTwoSortArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the First Array elements");
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Second Array Size");
        int m = sc.nextInt();
        System.out.println("Enter the second Array elements");
        int arr1[] = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        //Merge Two Sort Arrays
        int right = 0;
        int left = 0;
        int index = 0;
        int arr3[] = new int[n+m];
        while(left<n && right <m){
            if(arr[left]<=arr1[right]){
                arr3[index]=arr[left];
                left++;
                index++;
            }
            else{
                arr3[index]=arr1[right];
                index++;
                right++;
            }

        }   
        while(left<n){
            arr3[index]=arr[left];
            left++;
            index++;
        }
        while(right<m){
            arr3[index]=arr[right];
            right++;
            index++;
        }

        System.out.println("The Merged Elements are");

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        //Another possibility is 
        for(int i=0;i<arr3.length;i++){
            if(i <n){
                arr[i] = arr3[i];
            }
            else{
                arr1[i-n]=arr3[i];
            }
        }
    }
 }*/

 //The same above approach using collections

/*import java.util.*;

 public class MergeTwoSortArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        System.out.println("Enter the size");
        int count = sc.nextInt();
        for(int i=0;i<count;i++){
            list1.add(sc.nextInt());
        }
        System.out.println("Enter the second Array Size");
        int count1 = sc.nextInt();
        for(int i=0;i<count1;i++){
            list2.add(sc.nextInt());
        }
        int right =0;
        int left =0;
        while(left < count && right < count1){
            if(list1.get(left)<=list2.get(right)){
                list3.add(list1.get(left));
                left++; 
            }
            else{
                list3.add(list2.get(right));
                right++;
            }
        }
        while(left<count){
            list3.add(list1.get(left));
            left++;
        }
        while(right<count1){
            list3.add(list2.get(right));
            right++;
        }

        System.out.println("The elements are ");
        for(int i=0;i<list3.size();i++){
            System.out.println(list3.get(i));
        }
        sc.close();
    }
}*/


 /*import java.util.*;

 public class MergeTwoSortArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the First Array elements");
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Second Array Size");
        int m = sc.nextInt();
        System.out.println("Enter the second Array elements");
        int arr1[] = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        //Merge Two Sort Arrays
        int right = 0;
        int left = 0;
        int index = 0;
        int arr3[] = new int[n+m];
        while(left<n && right <m){
            if(arr[left]<=arr1[right]){
                arr3[index]=arr[left];
                left++;
                index++;
            }
            else{
                arr3[index]=arr1[right];
                index++;
                right++;
            }

        }   
        while(left<n){
            arr3[index]=arr[left];
            left++;
            index++;
        }
        while(right<m){
            arr3[index]=arr[right];
            right++;
            index++;
        }

        System.out.println("The Merged Elements are");

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        //Another possibility is 
        for(int i=0;i<arr3.length;i++){
            if(i <n){
                arr[i] = arr3[i];
            }
            else{
                arr1[i-n]=arr3[i];
            }
        }
    }
 }*/


 /*import java.util.*;

 public class MergeTwoSortArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the First Array elements");
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Second Array Size");
        int m = sc.nextInt();
        System.out.println("Enter the second Array elements");
        int arr1[] = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]= sc.nextInt();
        }
        //Merge Two Sort Arrays
        int right = 0;
        int left = 0;
        int index = 0;
        int arr3[] = new int[n+m];
        while(left<n && right <m){
            if(arr[left]<=arr1[right]){
                arr3[index]=arr[left];
                left++;
                index++;
            }
            else{
                arr3[index]=arr1[right];
                index++;
                right++;
            }

        }   
        while(left<n){
            arr3[index]=arr[left];
            left++;
            index++;
        }
        while(right<m){
            arr3[index]=arr[right];
            right++;
            index++;
        }

        System.out.println("The Merged Elements are");

        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        //Another possibility is 
        for(int i=0;i<arr3.length;i++){
            if(i <n){
                arr[i] = arr3[i];
            }
            else{
                arr1[i-n]=arr3[i];
            }
        }
    }
 }*/




 import java.util.*;

 public class MergeTwoSortArrays {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println("Enter the First Array elements");
         int arr[] = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         System.out.println("Enter the Second Array Size");
         int m = sc.nextInt();
         System.out.println("Enter the second Array elements");
         int arr1[] = new int[m];
         for (int i = 0; i < m; i++) {
             arr1[i] = sc.nextInt();
         }
         // Merge Two Sort Arrays
         int right = arr1.length;
         int left = 0;
         int index = 0;
         
         while (left < n && right < m) {
             if (arr[left] <= arr1[right]) {
                 arr3[index] = arr[left];
                 left++;
                 index++;
             } else {
                 arr3[index] = arr1[right];
                 index++;
                 right++;
             }

         }
         while (left < n) {
             arr3[index] = arr[left];
             left++;
             index++;
         }
         while (right < m) {
             arr3[index] = arr[right];
             right++;
             index++;
         }

         System.out.println("The Merged Elements are");

         for (int i = 0; i < arr3.length; i++) {
             System.out.println(arr3[i]);
         }

         // Another possibility is
         for (int i = 0; i < arr3.length; i++) {
             if (i < n) {
                 arr[i] = arr3[i];
             } else {
                 arr1[i - n] = arr3[i];
             }
         }
         sc.close();
     }
 }