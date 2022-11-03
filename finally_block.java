package CWH;

public class finally_block {
    public static int greeat(){
        try{
            int a =50;
            int b=2;
            int c=a/b;
            return c;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println(" this is the end of program");
        }
        return 0;
    }
    public static void main(String[] args) {
        int c = greeat();
        System.out.println(c);
        try{
            System.out.println(5/0);
        }
        finally {
            System.out.println(" final ");
        }

    }
}
