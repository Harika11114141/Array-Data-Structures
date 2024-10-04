import java.util.Scanner;
class ArraySumCalculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size:");
        int array[] = new int[scan.nextInt()];
        for(int i = 0; i <= array.length-1; i++)
        {
            array[i] = scan.nextInt();
        }
        System.out.print("Original array:[");
        for(int i = 0; i <= array.length-1; i++) 
        {
            System.out.print(array[i]);
            if(i < array.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int result = ArraySumCalculator.findSum(array);
        System.out.println("sum : " + result);

    }
    public static int findSum(int []array)
    {
        int sum = 0;
        for(int i = 0; i <= array.length-1; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}
