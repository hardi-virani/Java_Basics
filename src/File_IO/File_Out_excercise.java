package File_IO;

//QUESTION: Write a program that writes the numbers from 1 to 100 to a file named "numbers.txt"

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class File_Out_excercise
{
    public static  void main(String[]args)
    {
        //Here file is created.
        try (PrintWriter f = new PrintWriter(new File("Number.txt")))
        {
            //All this things are entered in the file.
            for(int i=1;i<=100;i++)
            {
                f.println(i);
            }
            System.out.println("Check the file!!");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File not found");
            System.exit(0);
        }

    }

}
