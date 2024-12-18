
/*Sort an array of 0 s,1 s and 2 s

1 Problem Statement:Given an array consisting of only 0 s,1 s,and 2 s.Write a program to in-place sort the array without using inbuilt sort functions.(Expected:Single pass-O(N)and constant space)


Input:nums=[2,0,2,1,1,0]Output:[0,0,1,1,2,2]

Input:nums=[2,0,1]Output:[0,1,2]

Input:nums=[0]Output:[0] */

/*import java.util.Scanner;

class SortZeroOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int low=0,mid=0,high=n-1; 
        while(mid<=high){
            if (arr[mid]==0){
                int temp = arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            } 

            else if(arr[mid]==1){
                mid++;
            }

            else {
                int temp = arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println("The Array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}*/

import java.util.*;
import java.util.ArrayList;

class SortZeroOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the Array Size");
        int count = sc.nextInt();
        System.out.println("Enter the Array elements to be sorted");
        for(int i=0;i<count;i++){
            int input = sc.nextInt();
            numbers.add(input);
        }

        int high = numbers.size()-1;
        int low = 0;
        int mid = 0;
        while(mid<=high){
            if(numbers.get(mid)==0){
                //Swap numbers mid and low
                int temp = numbers.get(mid);
                numbers.set(mid, numbers.get(low));
                numbers.set(low, temp);
                low++;
                mid++;
            }
            else if(numbers.get(mid)==1){
                mid++;
            }
            else{
                int temp = numbers.get(mid);
                numbers.set(mid,numbers.get(high));
                numbers.set(high,temp);
                high--; 
            }
        }
        System.out.println("The Array elements are ");
        for(int i=0;i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
        sc.close();
    }
}