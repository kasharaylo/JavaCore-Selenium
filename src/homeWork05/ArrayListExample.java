package homeWork05;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        //FileReader of input.txt
        FileReader NamesArrayList = null;
        System.out.println("\n______________RESULT OF READING____________");
        try {
            NamesArrayList = new FileReader("src/homeWork05/input.txt");
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
        ArrayList<String> list = new ArrayList<String>();
        try (Scanner result1 = new Scanner(new File("src/homeWork05/input.txt"))) {
            while (result1.hasNextLine()) {
                list.add(result1.nextLine());
            }
        }
        System.out.println("\n______________RESULT OF ARRAY with Scanner____________");
        System.out.println(list);

        //BufferedReader of file input.txt
        ArrayList<String> result2 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/homeWork05/input.txt"))) {
            while (br.ready()) {
                result2.add(br.readLine());
            }
        }
        System.out.println("\n______________RESULT OF ARRAY with BufReader____________");
        System.out.println(result2);

        //Array into output.txt
        FileWriter output = new FileWriter("src/homeWork05/output.txt");
        for (String str: list) {
            output.write(str + System.lineSeparator());
        }
        output.close();
    }
}


