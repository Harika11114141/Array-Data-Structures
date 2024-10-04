import java.util.Arrays;
import java.util.Scanner;
public class InsertionAnElementInAnArray {
	public static void main(String[] args) {
		//int size = 10;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of original array:");
		int size = scan.nextInt();
		System.out.println("enter the array values:");
		int originalArray[] = new int[size];
		for(int i = 0; i <= size-1 ; i++) {
			originalArray[i] = scan.nextInt();
		}
		System.out.println("Enter the position:");
		int position = scan.nextInt();
		System.out.println("Enter the new element:");
		int newElement = scan.nextInt();
		System.out.println("Original array: " + Arrays.toString(originalArray));
		originalArray = insertionNewElement(originalArray, size, position, newElement);
		System.out.println("\nArray with " + newElement + " inserted at position " + position + ":\n" + Arrays.toString(originalArray)); 
	}
//}
	public static int[] insertionNewElement(int originalArray[], int size, int position, int newElement) 
	{
		int []newArray = new int[size+1];
		for(int i = 0; i < size + 1; i++)
		{
			if(i < position - 1)
			{
				newArray[i] = originalArray[i];
			}
			else if(i == position-1) 
			{
				newArray[i] = newElement;
			}
			else 
			{
				newArray[i] = originalArray[i-1];
			}
		}
		return newArray;
	 }
}




