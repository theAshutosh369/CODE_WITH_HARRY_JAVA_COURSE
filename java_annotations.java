package CWH;

@FunctionalInterface   // used to ensure an interface is a functional interface
interface inter
{
    void add();
//    void sum();
}
class newC
{
    public void time() {
        System.out.println(" the time is 8 AM");
    }

    @Deprecated // depricate zalay method as
    public int add(int a, int b) {
        return a+b;
    }
}

class c extends newC
{
    @Override  // its an annoptation - it gives extra information of program
    public void time()
    {
        System.out.println(" the time is 8 PM" );
    }
}
public class java_annotations {
    @SuppressWarnings(" deprication ")  //  compiler ki warnings ko dabana
    public static void main(String[] args) {
        newC n = new newC();
        n.time();
        n.add(5,7);
    }
}
