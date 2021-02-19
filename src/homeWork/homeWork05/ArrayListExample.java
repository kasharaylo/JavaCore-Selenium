package homeWork.homeWork05;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        //FileReader of input.txt
        FileReader NamesArrayList = null;
        System.out.println("\n______________RESULT OF READING____________");
        try {
            NamesArrayList = new FileReader("src/HomeWork.homeWork05/input.txt");
            int i = 0;
            //while loop
            while ((i = NamesArrayList.read()) != -1) {
                System.out.print((char) i);
            }
        } finally {
            if (NamesArrayList != null) {
                NamesArrayList.close();
            }
        }

        //Scanner of file input.txt
        ArrayList<String> list1 = new ArrayList<String>();
        try (Scanner result1 = new Scanner(new File("src/HomeWork.homeWork05/input.txt"))) {
            while (result1.hasNextLine()) {
                list1.add(result1.nextLine());
            }
        }
        System.out.println("\n______________RESULT OF ARRAY with Scanner____________");
        System.out.println(list1);

        //BufferedReader of file input.txt
        ArrayList<String> list2 = new ArrayList<>();
        try (BufferedReader result2 = new BufferedReader(new FileReader("src/HomeWork.homeWork05/input.txt"))) {
            while (result2.ready()) {
                list2.add(result2.readLine());
            }
        }
        System.out.println("\n______________RESULT OF ARRAY with BufReader____________");
        System.out.println(list2);

        //Array into output.txt
        FileWriter output = new FileWriter("src/HomeWork.homeWork05/output.txt");
        for (String str: list1) {
            output.write(str + System.lineSeparator());
        }
        output.close();
    }
}


