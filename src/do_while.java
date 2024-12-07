import java.util.Scanner;
public class do_while
{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        int num;

        do {
            System.out.println("Enter your number: ");
            num = obj.nextInt();
        }
        while(num>1 && num<100);

        System.out.println("Check your number might be smaller or greater than 1 and 100 respectively");

    }
}
