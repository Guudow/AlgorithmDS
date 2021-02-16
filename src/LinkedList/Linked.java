package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        // System.out.println(list);
    }
}
