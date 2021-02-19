package javaCorePractics.practics11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]){
        //Create non-generic ArrayList (LIST)
        List arrayList1 = new ArrayList();
        arrayList1.add("element1");
        arrayList1.add(1);
        arrayList1.add(2, 5.24);
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);

        //Create non-generic ArrayList (ARRAYLIST)
        System.out.println("-------------------------------------");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("String3");
        arrayList2.add(3);
        arrayList2.add(true);
        System.out.println(arrayList2);
        arrayList2.remove(0);
        System.out.println(arrayList2);

        //Generic ArrayList that can contain only one object (LIST)
        System.out.println("-------------------------------------");
        List<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("String1");
        arrayList3.add("String2");
        System.out.println(arrayList3);
        arrayList3.remove(0);
        System.out.println(arrayList3);

        //Generic ArrayList that can contain only one object (ARRAYLIST)
        System.out.println("-------------------------------------");
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("string1");
        arrayList4.add("string2");
        System.out.println(arrayList4);
        arrayList4.remove(0);
        System.out.println(arrayList4);

        //Generic ArrayList that can contain only one object (ARRAYLIST)
        System.out.println("-------------------------------------");
        ArrayList<Double> arrayList5 = new ArrayList<Double>();
        arrayList5.add(5.5);
        arrayList5.add(7.7);
        System.out.println(arrayList5);
        arrayList5.remove(0);
        System.out.println(arrayList5);
    }
}
