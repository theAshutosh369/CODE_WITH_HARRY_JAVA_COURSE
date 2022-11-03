package CWH;

import java.util.HashSet;

public class hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> h = new HashSet<Integer>();
         h.add(3);
        h.add(5);
        h.add(49);
        h.add(44);
        h.add(98);
        h.add(44);
        h.add(5);
        System.out.println(h);
    }
}
