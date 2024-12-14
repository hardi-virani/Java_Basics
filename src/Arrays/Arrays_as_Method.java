//Question: Write a method named addOne() that increments every value in an array by one. The array must be passed as an argument to addOne().
package Arrays;

public class Arrays_as_Method
{
    public static void main(String[]args)
    {
        int[] arr = {9,2,3,4,5};
        addOne(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }

    }
    //New method which is void as well as passed the array in argument.
    public static void addOne(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            arr[i] = arr[i]+1;
        }

    }

}
