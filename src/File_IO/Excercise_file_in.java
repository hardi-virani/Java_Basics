
//Question: Write a program that opens a file named integers.txt, then reads 5 integers from the file and prints each one out.
//-> You will have to create the integers.txt file manually first and put at least 5 integers into it.

package File_IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Excercise_file_in
{
    public static void main(String[]args)
    {
        try(Scanner f = new Scanner(new File("integer.txt")))
        {
            for(int i=0;i<6;i++)
            {
                //Handling the nosuchelement Exception. There can be more such as .hasNextDouble(), .hasNextLine() and so.. 
                if(f.hasNextInt())
                {
                    int a = f.nextInt();
                    System.out.println(a);
                }
                else
                {
                    System.out.println("There are no more integers");
                    break;
                }
            }


        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File integer.txt does not exist");
            System.exit(0);
        }

    }
}
