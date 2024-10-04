import java.util.Scanner;

class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rows1 = sc.nextInt();
        int columns1 = sc.nextInt();
        int[][] arr1 = new int[rows1][columns1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                System.out.println("Enter element for row " + i + " and column " + j);
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of rows and columns for the second matrix:");
        int rows2 = sc.nextInt();
        int columns2 = sc.nextInt();
        int[][] arr2 = new int[rows2][columns2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.println("Enter element for row " + i + " and column " + j);
                arr2[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        int[][] res = multiplyMatrices(arr1, arr2, rows1, columns1, columns2);
        System.out.println("The product of the matrices is:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] arr1, int[][] arr2, int rows1, int columns1, int columns2) {
        int[][] product = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return product;
    }
}
