
public class String_Formatting
{
    public static void main(String[]args)
    {
        double value1 = 3.1415;
        int value2 = 13;
        //String formatting is a bit tricky, but you can learn the real and crisp method from Chatgpt.
        // If you are revising.Look below comments.
        // String formatting in Java allows you to control how text and values are displayed.
        //Here, #.3f is for decimal or double value and %d means the integer value and %n means new line and %s means string.
        // This code "%n",".3f" , "%d" and many more, will automatically fetch the value according to their respective declared variable. like int, double and etc.
        // Advantage: String formatting will help us avoid manual string concatenation. Eg: "Hello " + name + ", you scored " + score.
        System.out.printf("The result is %.3f and %d and this is the %n %s", value1, value2, "hello new line");

    }
}
