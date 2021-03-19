package javaCorePractics.practics05;

public class Practics05Class05 {
    public static final String STRING_TEST = "This is my " + "small example";

    //match any character with .*
    //match beginning character - ^
    //match ending character- $

    public static void main (String args[]){
        System.out.println(STRING_TEST.matches("\\w.*"));
        String[] splitString = (STRING_TEST.split("\\s+"));
        System.out.println(splitString.length);
        //for each loop
        for (String s: splitString){
            System.out.println(s);
        }
        System.out.println(STRING_TEST.replaceAll("\\s", "\t"));
    }
}
