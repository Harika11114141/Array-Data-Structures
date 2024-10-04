import java.util.Scanner;
public class ReverseAnArray {
	public static void main(String[] args) {
		System.out.println("Enter the Array size: ");
		Scanner sc = new Scanner(System.in);
		int []arr1 = new int[sc.nextInt()];
		 for(int i = 0; i <= arr1.length-1 ; i++) {
		     arr1[i] = sc.nextInt();
		 }
		 System.out.print("Original array: [");
		 for(int i = 0; i <= arr1.length-1; i++) {
			 System.out.print(arr1[i]);
			 if(i < arr1.length-1) {
				 System.out.print(", ");
			 }
		 }
		 System.out.println("]");
		 
		 int []res = reverseArray(arr1);
		 System.out.print("Reversed Array: [");
		 for(int i = 0; i < res.length; i++) {
			 System.out.print(res[i]);
			 if(i < res.length-1) {
				 System.out.print(", ");
			 }
		 }
		 System.out.println("]");
		 
		 sc.close();
	}
		 public static int[] reverseArray(int[] arr1) {
			 int []arr2 = new int[arr1.length];
			 int j = arr1.length-1;
			 for(int i = 0; i<= arr1.length-1; i++) {
				 arr2[j] = arr1[i];
				 j--;
			 }
			 return arr2;
		 }
}


