package CWH;

import java.util.ArrayList;

public class Arraylist
{
    public static void main(String[] args)
    {
        // arraylist class implemetation
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>(5);

        l1.add(10);
        l1.add(11);
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);


        // for each loop
        for( Integer i : l1){
            System.out.println(i);
        }

        // length of Arraylist
        System.out.println("length of arraylist is " +l1.size());

        // accessing elements
        System.out.println("the 2nd element in arraylist is : "+ l1.get(1));

        // updating
        l1.add(2,20);
        System.out.println("2nd index element after updating is : "+ l1.get(2));

        // adding an whole arraylist to other arraylist
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(400);
        l2.add(500);
        l2.add(600);
        l2.add(1000);

        System.out.println("l2 arraylist is :");
        for(Integer i :l2 )
        {
            System.out.println(i);
        }

        l1.addAll(l2); // l1 me l2 add hoga
        System.out.println("l1 after upadting is :");
        for( Integer e : l1){
            System.out.println(e);
        }

        // clearing all elements in arraylist
        l2.clear();
        System.out.println("elements in l2 after clearing are : ");
        for(Integer i : l2)
        {
            System.out.println(l2);
        }
        System.out.println("size of l2 :"+l2.size());

//        contains - boolean type
        System.out.println("element 20 is present in l1 : "+l1.contains(20));

//         index of function
        System.out.println(" index of 15 in l1 is :"+l1.indexOf(15));

        // remove method
        l1.remove(4);
        System.out.println("element on 4th index in l1 after removing is : "+l1.get(4));


    }
}
