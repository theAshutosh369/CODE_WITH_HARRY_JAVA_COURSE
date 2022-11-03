package CWH;

class myThread extends Thread
{
    myThread(String name)
    {
        super(name);
    }
    public void run()
    {
        System.out.println("i am a thread");
    }
}
public class constructors_in_thread_class {
    public static void main(String[] args) {
        myThread t = new myThread("ashutosh");
        t.start();
        System.out.println("name of thread is : "+t.getName());
        System.out.println("id of thread is : "+t.getId());
        System.out.println("id of thread is : "+t.getThreadGroup());
        System.out.println("id of thread is : "+t.getState());
    }
}
