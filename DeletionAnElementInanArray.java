import java.util.Scanner;

class DeletionAnElementInanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int []array1 = new int[sc.nextInt()];
        System.out.println("enter the array elements: ");
        for(int i = 0; i <= array1.length-1; i++)
        {
            array1[i] = sc.nextInt();
        }
        System.out.print("Original array: [");
        for(int i = 0 ; i <= array1.length-1; i++)
        {
            System.out.print(array1[i]);
            if(i < array1.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.println("Enter the index value to be deleted:");
        int index = sc.nextInt();
        int[] result = deletionMethod(array1, index);
        System.out.print("After the deleted the value , new array is here: [");
        for(int i = 0; i <= result.length-1; i++) {
            System.out.print(result[i]);
            if(i < result.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static int[] deletionMethod(int []array1, int index)
    {
        int newArr[] = new int[array1.length-1];
        //Scanner sc = new Scanner(System.in);
        //int index = sc.nextInt();
        for(int i = 0; i < array1.length; i++)
        {
            if(i < index) {
                newArr[i] = array1[i];
            }
            else if(i > index) {
                newArr[i-1] = array1[i];
            }
        }
        return newArr;
    }
}







 