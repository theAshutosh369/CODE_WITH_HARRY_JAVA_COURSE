package CWH;

interface DemoAno
{
    void meth1(int a );
}
//class AnonyDemo implements DemoAno{
//    public void meth1(){
//        System.out.println(" meth 1");
//    }
//    public void meth2(){
//        System.out.println(" meth 2");
//    }
//}
public class lambda {
    public static void main(String[] args)
    {
//        DemoAno obj= new AnonyDemo();
//        obj.meth1();     // he simple way ahe

        // anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                  System.out.println(" meth 1");
//            }
//
//            @Override
//            public void meth2() {
//                  System.out.println(" meth 1");
//            }
            // fkt ekdach te interface vapraych asel tr anonymous class vaprl tri chalt
            // ithech declare krun ithech implement hot
//        };
//          obj.meth1();


        // lambda expression
        // jr interface madhe ekch fn asel ani tyala implement kraych asel tr lambda vapru shakto
        DemoAno o = (a)->{
            System.out.println(" this is meth 1 : "+ a);
        };
        o.meth1(10);



    }
}
