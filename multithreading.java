// program of threading by extending the classes

package CWH;

class myThread1 extends Thread
{
    @Override
    public void run() {
        int i=0;
        while (i<40000) {
            {
                System.out.println("my thread 1 is runnning ");
                System.out.println("i am happy");
                i++;
            }
        }
    }
}
class myThread2 extends Thread
{
    @Override
    public void run() {int i=0;
        while (i<40000)  {
            {
                System.out.println("my thread 2 is runnnifng ");
                System.out.println("i am happy");
                i++;
            }
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();  // mythread1 ch method run hoil apoap
        t2.start();   // mythread2 ch method run hoil apoap

        // donhi at a time run hotil but thoda time threa1 la ani mg thoda thread2 la as run hoil
        // joparyant thread1 execute hot ahe tya time madhe thread2 hi run hoil and as alternatively hoil
    }
}
