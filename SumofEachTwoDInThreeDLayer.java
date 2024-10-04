
import java.util.Scanner;

public class SumofEachTwoDInThreeDLayer {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the layers, rows, columns");
        int layers = sc.nextInt();
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][][]array = new int[layers][rows][cols];
        for(int i = 0; i <= array.length-1; i++) {
            for(int j = 0; j <= array[i].length-1; j++) {
                for(int k = 0; k <= array[i][j].length-1; k++) {
                    array[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("3D arrays:");
        for(int i = 0; i <= array.length-1; i++) {
            System.out.println("Layer :" +(i + 1));
            for(int j = 0; j <= array[i].length-1; j++) {
                for(int k = 0; k <= array[i][j].length-1; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println(" ");
            }
        }

        for(int i = 0; i <= array.length-1; i++) {
            int sum = 0;
            for(int j = 0; j <= array[i].length-1; j++) {
                for(int k = 0; k <= array[i][j].length-1; k++) {
                    sum += array[i][j][k];
                }
            }
            System.out.println("sum of layer " + (i+1) + " is: " + sum);
        }
        sc.close();
    }
}
