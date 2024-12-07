//QUESTION!!!💥
//Write a program that uses a do-while loop to read integer values from the user until a value between 1 and 100 (inclusive) is entered.

//always understand the question. Before this current commit, I made a mistake the only number between, 1 to 100 are allowed, but then I realize that it says UNTIL.
// always read question perfectly.
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
        while(num<1 || num>100);

        System.out.println("Check your number");

    }
}
