//QUE: Write a program that creates an array of 1000 integer values and initializes all 1000 values to 13.
package Arrays;

public class Array_Prac
{
    public static void main(String[]args)
    {
        //creating an array
        int[] arr = new int[1000];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=13;
            System.out.println(i+ "="+arr[i]);

        }
    }

}
