/*Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise. */

/*Example 1:
Input:
 [[1,2,3],[4,5,6],[7,8,9]]

Output
: [[7,4,1],[8,5,2],[9,6,3]]

Explanation:
 Rotate the matrix simply by 90 degree clockwise and return the matrix.

Example 2:
Input:
 [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]

Output:
[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

Explanation:
 Rotate the matrix simply by 90 degree clockwise and return the matrix */

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of colums");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // //Rotate the Matrix.
        int transpose[][] = new int[m][n];
        System.out.println("The transpose elements are ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[i][j]=arr[j][i];
                
            }
        }
        
        //Now need to reverse the above array
        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left < right) {
                int temp = transpose[i][left];
                transpose[i][left] = transpose[i][right];
                transpose[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("The elements Rotated are ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }
    }
}
