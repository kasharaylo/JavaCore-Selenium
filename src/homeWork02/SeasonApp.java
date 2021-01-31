package homeWork02;
public class SeasonApp {
    public static void main (String[] args) {

        String currentMonth = "January";
        Season season = Season.DEFAULT;

        switch (currentMonth) {
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
        System.out.println(currentMonth + " is " + season);
    }
}
