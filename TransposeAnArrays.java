import java.util.Scanner;
class TransposeAnArrays {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int [][]arr1 = new int[rows][columns];
        for(int i = 0; i <= arr1.length-1; i++) {
            for(int j = 0; j <=arr1[i].length-1; j++) {
                System.out.println("enter the row  " + i + " and column " +j);
                arr1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Array elements: ");
        for(int i = 0; i<= arr1.length-1; i++) {
            for(int j = 0; j <= arr1[i].length-1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println( );
        }
        //transpose the elements
        int [][]arr2 = new int[columns][rows];
        for(int  i = 0; i <= arr1.length-1; i++) {
            for(int j = 0; j <= arr1[i].length-1; j++) {
                arr2[j][i] = arr1[i][j];
            }
        } 
        System.out.println(" After transpose the array elements: ");
        for(int i = 0; i<= arr2.length-1; i++) {
            for(int j = 0; j <= arr2[i].length-1; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
