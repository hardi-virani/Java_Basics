package Arrays;
import java.util.Scanner;
public class Searching_Element
{
    public static void main(String[]args)
    {
        int[] arr = {4, 11, -3, 0, 46, 11, 9, -77, 3, 11};
        System.out.println("Index at which the value is located: "+searchArray(arr));
    }

    public static int searchArray(int[]arr)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int search = input.nextInt();

        for(int i=0; i<arr.length;i++)
        {
            if(search==arr[i])
            {
                return i;
            }
        }

        return -1;

    }
}


//The actual answer

//import java.util.Scanner;
//public class ClassExamples {
//public static void main(String[] args) {
//Scanner input = new Scanner(System.in);
//int[] values = {4, 11, -3, 0, 46, 11, 9, -77, 3, 11};
//int target_value, index;
//System.out.print("Enter a value to search for: ");
//target_value = input.nextInt();
//index = searchArray(values, target_value);
//if (index == -1) {
//System.out.println("Target not found!");
//} else {
//System.out.println("Target found at index " + index);
//}
//}
//public static int searchArray(int[] haystack, int needle) {
//for (int i = 0; i < haystack.length; i++) {
//if (haystack[i] == needle) {
//return i;
//}
//}
//return -1;
//}
//}
