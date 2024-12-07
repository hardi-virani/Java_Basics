package Methods;

public class Method_with_Parameters
{
    public static void main(String[] args)
    {
        double result1, result2;
        result1 = doCalculation(3, 4);
        //Check the difference between %.3f
        System.out.printf("result1 is %.3f%n", result1);

        result2 = doCalculation(2, 8);
        //Check the difference between %.1f & %.3f
        System.out.printf("result2 is %.1f%n", result2);
    }
        public static double doCalculation(double a, double b)
        {
            return (a*a + b*b);
        }
    }