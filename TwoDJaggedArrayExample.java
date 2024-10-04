import java.util.Scanner;

class TwoDJaggedArrayExample
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the 1D array :");
       int [][]array = new int[sc.nextInt()][ ];
       System.out.println("Enter the 2D each for 1D");
        //jagged arrays
       for(int i = 0; i <= array.length-1; i++) 
       {
        System.out.println("Enter the size of each 2D array " + i + "in 1D");
        array[i] = new int[sc.nextInt()];
       }
       //over jagged array
       System.out.println("enter the elements: ");
       for(int i = 0; i <= array.length-1; i++) 
       {
        for(int j = 0; j <= array[i].length-1; j++) 
        {
            array[i][j] = sc.nextInt();
        }
       } 
       System.out.println("Array elements are : ");
       for(int i = 0; i <= array.length-1; i++) 
       {
        for(int j = 0; j <= array[i].length-1; j++) 
        {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
       }
    }
}






