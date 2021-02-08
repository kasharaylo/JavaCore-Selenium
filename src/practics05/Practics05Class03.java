package practics05;

import java.util.Locale;

public class Practics05Class03 {
    public static void main (String args[]){
        String str1 = "Hello Students" + " Welcome to Java world!";
        String str2 = "Welcome";
        String str3 = "";
        String str4 = " ";

        System.out.println(str1.length());
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(6, 13));
        System.out.println(str1.contains("Hello"));
        System.out.println(str2.equals("welcome"));
        System.out.println(str2.equalsIgnoreCase("welcome"));
        System.out.println(str3.isEmpty());
        System.out.println(str4.isEmpty());
        System.out.println();

        String str5 = "Hello Students. ";
        String str6 = "Welcome";
        String str7 = "test";
        String str8 = "Java";
        String str9 = "        string        ";
        int totalStudents = 50;
        String str10 = "abc, def, ghi";

        String[] strCount = str10.split("\\s+");
        System.out.println(str10);
        System.out.println(str5.concat(str6));
        System.out.println(str5.replace('e', 'a'));
        System.out.println(str7.toLowerCase());
        System.out.println(str8.toUpperCase());
        System.out.println(str9.trim());
        System.out.println(String.valueOf(totalStudents));
        System.out.println(strCount.length);

        for (String s: strCount) {
            System.out.println("World " + s);
        }
    }
}
