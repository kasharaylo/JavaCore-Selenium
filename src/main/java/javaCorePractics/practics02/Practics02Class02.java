package javaCorePractics.practics02;
import javaCoreHomeWork.homeWork02.Season;

public class Practics02Class02 {
    public static void main (String[] arg) {
        //STATEMENT IF
        System.out.println("--------------STATEMENT IF");
        int a = 1;
        int b = 2;

        if (a < b) {
            System.out.println("true"); // output
        } else {
            System.out.println("false");
        }

        if (a > b) {
            System.out.println("true");
        } else {
            System.out.println("false"); // output
        }

        //TERNARY OPERATOR ? :
        System.out.println("--------------TERNARY OPERATOR ? : ");
        int c = 5, d = 10;

        String one = c >= d? "yes" : "no";
        String two = d >= c? "yes" : "no";

        System.out.println(one); // output -no
        System.out.println(two); // output -yes

        //SWITCH
        System.out.println("--------------SWITCH");

        System.out.println("Do you have a pet? (yes/no)");
        String enter = "yes";

        switch (enter.toLowerCase()) {
            case "yes":
                System.out.println("Okay!"); // output
                break;
            case "no":
                System.out.println("Too bad!");
                break;
            default:
                System.out.println("please provide correct answer!");
        }

        System.out.println("Do you have a cat? (yes/no)");
        String enter2 = "no";

        switch (enter2.toLowerCase()) {
            case "yes":
                System.out.println("Okay!");
                break;
            case "no":
                System.out.println("Too bad!"); // output
                break;
            default:
                System.out.println("please provide correct answer!");
        }

        System.out.println("Do you have any animal? (yes/no)");
        String enter3 = "error";

        switch (enter3.toLowerCase()) {
            case "yes":
                System.out.println("Okay!");
                break;
            case "no":
                System.out.println("Too bad!");
                break;
            default:
                System.out.println("please provide correct answer!"); // output
        }

        //ENUM
        System.out.println("--------------ENUM");

        String month = "July";
        Season season = Season.DEFAULT;

        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                break;
            default:
                System.out.println("Error");
        }
        System.out.println(season);
    }
}

