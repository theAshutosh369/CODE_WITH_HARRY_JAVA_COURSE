package CWH;
class mythr extends Thread
{
    mythr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=0;
        while(i<40000) {
            System.out.println("thread :" + this.getName());
            i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args)
    {
        // ready queue : t1 t2 t3 t4 t5
        // min_priority = 1
        // norm_priority = 5
        // max_priority = 10

        mythr t1 = new mythr("a *");
        mythr t2 = new mythr("b");
        mythr t3 = new mythr("c");
        mythr t4 = new mythr("d");
        mythr t5 = new mythr("e");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();t2.start();t3.start();t4.start();t5.start();

        System.out.println("---------------------------------");

    }
}
