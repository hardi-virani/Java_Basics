import java.util.Scanner;
//Syntax practice
//Only average of 3
public class avg
{
    public static void main(String[]args)
    {
        Scanner object = new Scanner(System.in);

        System.out.print("Enter your 1st number: ");
        int a = object.nextInt();

        System.out.print("Enter your 2nd number: " );
        int b = object.nextInt();

        System.out.print("Enter your 3rd number: ");
        double c = object.nextDouble();

        double avg = (a+b+c)/3;
        System.out.print("Average: ");
        System.out.print(avg);


    }

}
