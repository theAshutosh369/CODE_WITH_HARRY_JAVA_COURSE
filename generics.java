package CWH;

import java.util.ArrayList;

class MyGenerics<t1>
{
    int val ;
    private t1 t;
    MyGenerics(int a )
    {
        this.val = a;
    }

}
public class generics {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        a.add(54);
        a.add(3443);
        System.out.println(a.get(1));

        //
        MyGenerics<Integer> mg = new MyGenerics<Integer>(23);
        int f = mg.val;
        System.out.println(f);
    }
}
