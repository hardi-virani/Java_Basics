package File_IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//Hello

public class File_output
{
    public static void main(String[]args)
    {
        //Here file fileoutprac is created.
        try(PrintWriter fout = new PrintWriter(new File("fileoutprac.txt")))
        {
            //All this things are add to the file fileoutprac.
            double value = 33.3232;
            fout.println("Hello my fileoutprac!");
            fout.print("Value: ");
            fout.printf("%.2f%n",value);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("File fileoutprac not found!");
            System.exit(0);
        }

    }
}
