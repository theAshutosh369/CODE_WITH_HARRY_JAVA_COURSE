package CWH;

import java.util.LinkedList;

public class linkedList
{
    public static void main(String[] args)
    {
        // sagle same ch methods ahet jashe arraylist che ahet
        LinkedList<Integer> l = new LinkedList<Integer>();
        l.add(100);
        l.add(200);
        l.add(300);l.add(400);
        l.add(500);l.add(600);l.add(700);
        System.out.println("elements in linkedList are : ");
        for( Integer o : l)
        {
            System.out.println(o);
        }
        // so arraylist perfect kra linked list apoap yeil


    }

}
