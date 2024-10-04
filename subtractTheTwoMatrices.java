import java.util.Scanner;

class subtractTheTwoMatrices {
    public static void main(String[] args) {
        System.out.println("Enter the rows and columns");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][]arr1 = new int[rows][columns];
        for(int i = 0; i <= arr1.length-1; i++) {
            for(int j = 0; j <= arr1[i].length-1; j++) {
                System.out.println("enter the fisrt matrix of row " + i+ " and column " + j);
                arr1[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter the first array elements:");
         for(int i = 0; i <= arr1.length-1; i++) {
            for(int j = 0; j <= arr1[i].length-1; j++) {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println("");
        }
        int [][]arr2 = new int[rows][columns];
       
        for(int i = 0; i <= arr2.length-1; i++) {
            for(int j = 0; j <= arr2[i].length-1; j++) {
                System.out.println("enter the second matrix of row " + i+ " and column " + j);
                arr2[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter the second array elements:");
         for(int i = 0; i <= arr2.length-1; i++) {
            for(int j = 0; j <= arr2[i].length-1; j++) {
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println("");
        }
        int [][]res = findSubtractOfTwoMatrices(arr1, arr2, rows, columns);
        System.out.println("subtract of 2 matrices:");
        for(int i = 0; i<= res.length-1; i++) {
            for(int j = 0; j <= res[i].length-1; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println( );
        }

       }
       public static int[][] findSubtractOfTwoMatrices(int [][]arr1,int [][]arr2,int rows, int columns) { 
        int [][]difference = new int[rows][columns];
        for(int i = 0; i <= rows-1; i++) {
            for(int j = 0; j <= columns-1; j++) {
                difference[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        return difference;
    }
}


