package CWH;

import java.util.Scanner;
class myException extends Exception
{
    public String toString()
    {
        return "I am toString()";
    }
    public String getMessage()
    {
        return " i am getMessage()";
    }
}
public class Exception_class {
    public static void main(String[] args)
    {
        int a;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        if(a<9)
        {
            try
            {
                throw new myException();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}
