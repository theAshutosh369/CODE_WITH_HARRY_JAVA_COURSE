package CWH;

class negativeRadius extends Exception{
    public String toString()
    {
        return " radius cant be negative ";
    }
}
public class throw_n_throws{
    static int area( float r) throws negativeRadius
    {
        if(r<0)
        {
            throw new negativeRadius();
        }
        float res = (float) (Math.PI * r *r);
        return (int) res;
    }
    static int divide(int a, int b) throws ArithmeticException
    {
        int res=a/b;
        return res;
    }

    public static void main(String[] args)
    {
        try{
            int c= divide(6 , 0);
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(" cant divide by 0 ");
        }

        try{
            int areac= area(-3);
            System.out.println(areac);

        }
        catch(Exception e)
        {
            System.out.println(" negative radius ");
        }


    }
}
