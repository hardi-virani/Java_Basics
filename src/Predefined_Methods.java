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
            //here pow is the pre-defined method. And it will always be in double type form, not integer.
            double ans = Math.pow(2,power);

//            System.out.println(ans);

            //2^%.0f this is the first part before = which means 2^3 : 3 being the power.
            // second part after = is %0.f means the ans after the calculation means 8
            //%n means next line.
            //Always remember this expression as it will show clear answers.
            // Ps. Do this practice more often to remember certain terms like this.
            // COMPARE the upper code where we only print ans and then the below code. It shows the vast difference.
            System.out.printf("2^%.0f=%.0f%n", power,ans);
            power++;
        }
    }

}
