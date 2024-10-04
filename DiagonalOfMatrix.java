//First, the matrix size and its elements are input by the user using nested loops.
//The primary diagonal is found by picking elements where row index equals column index (arr[i][i]).
//The secondary diagonal is found by selecting elements where row index and column index sum to n-1 (arr[i][n-1-i]).
//The sum of the primary diagonal is calculated by adding all elements arr[i][i].
//The sum of the secondary diagonal is similarly calculated using arr[i][n-1-i].
//Finally, the absolute difference between the two sums is computed.

import java.util.Scanner;

class DiagonalOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  rows and columns");
        int [][]arr = new int[sc.nextInt()][sc.nextInt()];
        System.out.println("Enter the values");
        for(int i = 0; i <= arr.length-1; i++) {
            for(int j = 0; j <= arr.length-1; j++) {
                System.out.println("Enter the array " + i + " and array of " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i <= arr.length-1; i++) {
            for(int j = 0; j <= arr.length-1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Diagonal elements of matrix ");
        findDiagonal(arr);
        System.out.println("Secondary Diagonal elements of matrix ");
        findSecondaryDiagonal(arr);
        // sum of diagonal
        int res = findSumOfDiagonal(arr);
        System.out.println("sum of Diagonal elements of matrix " + res);
        // sum of anti diagonal elements
        int res1 = findSumOfSecondaryDiagonal(arr);
        System.out.println("sum of Secondary Diagonal elements of matrix " + res1);
        //print absolute difference of  PDE and SDE
        int AbsoulteDifference = Math.abs(res-res1);
        System.out.println("absolute difference of  PDE and SDE: " + AbsoulteDifference);
    }
    //Diagonal elements of matrix
    public static void  findDiagonal(int [][]arr) {
        for(int i = 0; i <= arr.length-1; i++) { 
             System.out.print(arr[i][i] + " ");
        }
        System.out.println("");
    }
    //AntiDiagonal elements of matrix
    public static void findSecondaryDiagonal(int [][]arr) {
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i][arr.length-1-i]+ " ");
        }
        System.out.println("");
    }
    //sum of diagonal elements
    public static int findSumOfDiagonal(int [][]arr) {
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++) { 
             sum += arr[i][i];
        }
        return sum;
    }
    //sum of anti diagonal elements
    public static int findSumOfSecondaryDiagonal(int [][]arr) {
        int Antisum = 0;
        for(int i = 0; i <= arr.length-1; i++) {
            Antisum += arr[i][arr.length-1-i];
        }
        return Antisum;
    }

}
 