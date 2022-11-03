package CWH;
class mythr1 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<40000) {
            System.out.println("thread 0 :" + this.getName());
            i++;
        }
    }
}
class mythr2 extends Thread
{
    public void run()
    {
        int i=0;
        while(i<40000) {
            System.out.println("thread 1 :" + this.getName());
            i++;
        }
    }
}
public class thread_methods {
    public static void main(String[] args) {
        mythr1 t1 = new mythr1();
        mythr2 t2 = new mythr2();
        t1.start();
        try {
            t1.join();  // pahila t1 run hoil mg stop zale ki t2 run honar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
