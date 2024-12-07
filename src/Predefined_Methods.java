import java.util.Scanner;
public class Predefined_Methods
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of power: ");
        double power = input.nextDouble();


        while(power<=32)
        {
            double ans = Math.pow(2,power);
            System.out.printf("2^%.0f=%.0f%n", power,ans);
            power++;
        }
    }

}
