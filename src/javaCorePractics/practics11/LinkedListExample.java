package javaCorePractics.practics11;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main (String args[]){
        //Non-generic LinkedList with any objects
        List linkedList1 = new LinkedList();
        linkedList1.add("element1");
        linkedList1.add(1);
        linkedList1.add(2, 5.52);
        System.out.println(linkedList1);
        linkedList1.remove(0);
        System.out.println(linkedList1);

        //Generic LinkedList with only one object
        System.out.println("-------------------------------------");
        List linkedList2 = new LinkedList<String>();
        linkedList2.add("element1");
        linkedList2.add(1, "element2");
        System.out.println(linkedList2);
        linkedList2.remove(0);
        System.out.println(linkedList2);

        //Generic LinkedList with only one object
        System.out.println("-------------------------------------");
        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("element1");
        linkedList3.add(1, "element2");
        System.out.println(linkedList3);
        linkedList3.remove(0);
        System.out.println(linkedList3);
    }
}
