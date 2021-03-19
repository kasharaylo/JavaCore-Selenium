package javaCorePractics.practics16;

import java.util.Arrays;

public class Arr {
    public static void main(String args[]) {

        //fixed length array
        int[] arrayInt = {5, 25, 35, 45, 55};
        System.out.println("arrayInt.length: " + arrayInt.length);
        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);

        //Error
        //arrayInt[5] = 65;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }

        System.out.println(" ");

        //fixed length array
        int[] arrayIntSecond = new int[5];
        arrayIntSecond[2] = 27;
        arrayIntSecond[4] = 55;

        //Error
        //arrayIntSecond[10] = 100;

        for (int i = 0; i < arrayIntSecond.length; i++) {
            System.out.print(arrayIntSecond[i] + " ");
        }

        System.out.println(" ");
        System.out.println(Arrays.toString(arrayIntSecond));

        //Reverse Char array
        char[] arr = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];                         //local variable for reverse
            arr[i] = arr[arr.length - i - 1];           //0 element and add to it last one...
            arr[arr.length - i - 1] = temp;             //to last one setup temp

            System.out.println("I: " + i);              //iteration info
        }

        System.out.println(Arrays.toString(arr));
    }
}
