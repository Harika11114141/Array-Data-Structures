//user to enter the size of the array and read the integers to populate the array.
//Create an array of the specified size and use a loop to fill it with user-provided integers.
//Display the entire array in a formatted manner, ensuring proper comma placement between elements.
//Implement two separate methods to iterate through the array—findMaximum initializes a maximum value and updates it upon finding a larger element, while findMinimum does the same for the minimum value.
//Print the identified maximum and minimum values after the array has been processed, ensuring efficient termination of the program with proper resource management.

import java.util.Scanner;

class MaxAndMinElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array[] = new int[sc.nextInt()];
        for(int i = 0 ; i <= array.length-1; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Array: [");
        for(int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i]);
            if(i < array.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int result1 = findMaximum(array);
        System.out.println("Maximum value: " + result1);
        int result2 = findMinimum(array);
        System.out.println("Minimum value: " + result2);
    }
    public static int findMaximum(int []array) {
        int Max = array[0];
        for(int i = 0; i <= array.length-1; i++) {
            if(array[i] > Max) {
                Max = array[i];
            }
        }
        return Max;
    }
    public static int findMinimum(int []array) {
        int Min = array[0];
        for(int i = 0; i<= array.length-1; i++) {
            if(array[i] < Min) {
                Min = array[i];
            }
        }
        return Min;
    }
}

