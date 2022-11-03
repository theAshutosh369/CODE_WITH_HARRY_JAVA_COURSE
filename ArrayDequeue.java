package CWH;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static void main(String[] args)
    {
        // same methods ahet arraylist sarkhe
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(300);
        ad.add(500);
        ad.add(800);ad.add(900);ad.add(1100);
        ad.add(400);
        ad.addFirst(888);

        for(Integer i : ad) {
            System.out.println(i);
        }

    }
}
