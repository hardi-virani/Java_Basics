package Arrays;

public class Arrays_basic
{
    public static void main(String[]args)
    {
        double[] temperatures = new double[64];

        for (int i = 0; i < temperatures.length; i++)
        {
            temperatures[i] = 50;
            System.out.println(i+ " = " +temperatures[i]);
        }
    }
}
