/*
 * Problem Statement: Given a matrix if an element in the matrix is 0 then you
 * will have to set its entire column and row to 0 and then return the matrix.
 */

/*
 * Examples 1:
 * Input:
 * matrix=[[1,1,1],[1,0,1],[1,1,1]]
 * 
 * Output:
 * [[1,0,1],[0,0,0],[1,0,1]]
 * 
 * Explanation:
 * Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.
 * 
 * Input:
 * matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
 * 
 * Output:
 * [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 * 
 * Explanation:
 * Since matrix[0][0]=0 and matrix[0][3]=0. Therefore 1st row, 1st column and
 * 4th column will be set to 0
 */

import java.util.Scanner;

public class setMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of colums");
        int m = sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the input for the arrays");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Set Matrix to zero
        boolean rowSet[] = new boolean[n];
        boolean colSet[] = new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    rowSet[i] = true;
                    colSet[j] = true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (rowSet[i] | colSet[j]) {
                    arr[i][j] = 0;
                }
            }
        }

        System.out.println("The Final Matrix is");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}