package Methods;
import java.util.Scanner;

public class UserDefined_Method
{
    public static void main(String[]args)
    {
        double var = getdouble();
        //var fetched the number from below method and then ran in main.
        System.out.print("Hardi, this is the number I got from getdouble method: "+var);
    }
    // This is the method created by user to run specific task.
    // this method should be out of main method.
    public static double getdouble()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any decimal number: ");
        double number = input.nextDouble();
        return number;


    }
}
