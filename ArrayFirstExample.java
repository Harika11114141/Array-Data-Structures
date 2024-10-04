 import java.util.Scanner;
public class ArrayFirstExample {
    public static void main(String[] args) {
        int []arr = new int[4];
        Scanner sc = new Scanner(System.in);
        //arr[0] = sc.nextInt();
        for(int i = 0; i<= arr.length-1;i++) 
        {
        System.out.println("Enter the Age of student " + i + ":");
        arr[i] = sc.nextInt();
        }
        for(int i = 0; i<= arr.length-1;i++) 
        {
        System.out.println("Age of student " + i + " is: "+ arr[0]);
        }
        sc.close();
    }
}




