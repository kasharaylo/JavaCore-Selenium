package javaCoreHomeWork.homeWork07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Strings {
    public static void main(String args[]) {

        //Array
        int [] program = IntStream.rangeClosed(0, 10).toArray();

        //Program to print array
        System.out.println("Array of Integers: ");
        for (int i = 0; i < program.length; i++) {
            System.out.print(program[i] + " ");
        }

        System.out.println();

        // Int Array > to String Array
        String srtProgram[] = new String[program.length];
        System.out.println("Convert Int Array to String Array: ");
        for (int i = 0; i < program.length; i++)
            srtProgram[i] = String.valueOf(program[i]);
        System.out.println(Arrays.toString(srtProgram));

        //Convert Array to String
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < srtProgram.length; i++) {
            sb.append(srtProgram[i]);
        }
        String str = sb.toString();
        System.out.println("Convert String array to Sting: ");
        System.out.println(str);

        System.out.println("_____________________________");

        // Actions with String
        System.out.println("Index of character '5': " + str.indexOf('5'));
        System.out.println("Replace character '5' to 'Five': " + str.replace("5", " Five "));
        System.out.println("Hide '7': " + str.replace("7", " "));

        String reversStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reversing of string: " + reversStr);
    }
}