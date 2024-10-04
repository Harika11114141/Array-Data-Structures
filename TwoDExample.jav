import java.util.Scanner;

class TwoDExample
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int [][]array = new int[3][4];
       for(int i = 0; i <= array.length-1; i++) {
        for(int j = 0; j <= array[i].length-1; j++) {
            System.out.println("Enter the Marks of class " + i + " and student " + j);
            array[i][j] = sc.nextInt();
        }
       } 
       System.out.println("Array elements are : ");
       for(int i = 0; i <= array.length-1; i++) {
        for(int j = 0; j <=array[i].length-1; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
       }
    }
}






