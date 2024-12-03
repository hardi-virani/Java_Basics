import java.util.Scanner;
public class StringFormat_Practice
{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter any decimal value : ");
        double input = obj.nextDouble();

        System.out.printf("Your rounding of value is %.3f%n",input);
    }
}
