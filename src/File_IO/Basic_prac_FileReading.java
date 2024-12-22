package File_IO;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Basic_prac_FileReading
{
    public static void main(String[]args)
    {
        //test.txt file is OUT OF SRC program. Be careful with that otherwise the program won't be able to find the file. And gives the output that file does not exist.
        try(Scanner fin = new Scanner(new File("test.txt")))
        {
            String firstline = fin.nextLine();
            System.out.println(firstline);
        }
        //This is to handle the error of filenotfoundexception. Both try and catch method.
        catch (FileNotFoundException ex)
        {
            System.out.println("File test.txt does not exist");
            System.exit(0);
        }

    }
}
