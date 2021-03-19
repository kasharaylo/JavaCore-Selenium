package javaCorePractics.practics16;

public class RegularExpression {

    public static void main(String[] args) {

        String s = "true";
        boolean result = isTrue(s);
        System.out.println(result);

        String myCustomMail = "kkash@softserveinc.com";
        String phone = "+12345678901";

        boolean res = isMail(myCustomMail);
        System.out.println(res);

        boolean res2 = isPhoneNumber(phone);
        System.out.println(res2);
    }

    // returns true if the string matches exactly "true"
    public static boolean isTrue(String s) {
        return s.matches("true");
    }

    // returns true if the string matches exactly "true" or "True"
    public static boolean isTrueVersion2(String s) {
        return s.matches("[tT]rue");
    }

    // returns true if the string matches exactly "true" or "True"
    // or "yes" or "Yes"
    public static boolean isTrueOrYes(String s) {
        return s.matches("[tT]rue|[yY]es");
    }

    // returns true if the string contains exactly "true"
    public static boolean containsTrue(String s) {
        return s.matches(".*true.*");
    }

    // returns true if the string contains of three letters
    public static boolean isThreeLetters(String s) {
        //return s.matches("[a-zA-Z]{3}");
        // simpler from for
        return s.matches("[a-zA-Z][a-zA-Z][a-zA-Z]");
    }

    // returns true if the string does not have a number at the beginning
    public static boolean isNoNumberAtBeginning(String s) {
        return s.matches("^[^\\d].*");
    }

    // returns true if the string starts from "+" or no and if it has 11 numbers
    public static boolean isPhoneNumber(String s) {
        return s.matches("(\\+*)\\d{11}");
    }

    // returns true if the string contains a arbitrary number of characters except b
    public static boolean isIntersection(String s) {
        return s.matches("([\\w&&[^b]])*");
    }

    public static boolean isMail(String mail) {
        return mail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}