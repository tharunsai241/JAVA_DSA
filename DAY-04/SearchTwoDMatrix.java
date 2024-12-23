/*Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not. */

/*Example 1:
Input Format:
 N = 3, M = 4, target = 8,
mat[] = 
1 2 3 4
5 6 7 8 
9 10 11 12
Result:
 true
Explanation:
 The ‘target’  = 8 exists in the 'mat' at index (1, 3).

Example 2:
Input Format:
 N = 3, M = 3, target = 78,
mat[] = 
1 2 4
6 7 8 
9 10 34
Result:
 false
Explanation:
 The ‘target' = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'. */


/*import java.util.Scanner;

public class SearchTwoDMatrix{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entering number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){   
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();
        boolean correct = SearchMatrix(arr,n,m,target);
        System.out.println("The element found at"+correct);

    }

    static boolean SearchMatrix(int arr[][],int n,int m,int target){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}*/


//Implementing Binary Search by making the 2D array into 1D


import java.util.Scanner;

public class SearchTwoDMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entering number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){   
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();
        //Taking another array as input
        int carr[] = new int[n*m];
        int[] correct = SearchMatrix(arr, n, m, target,carr);
        //Binary Search on the Array
        int bs = binarySearch(carr,target);
        if(bs==-1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }

    static int[] SearchMatrix(int arr[][], int n, int m, int target, int carr[]){
        int counter = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                carr[counter++] = arr[i][j];
            }
        }
        return carr;
    }

    static int binarySearch(int carr[],int target){
        int low=0;
        int high = carr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(carr[mid]<target){
                low=mid+1;
            }
            else if (carr[mid]==target){
                return mid;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }   
    }
