package practics03;

public class Student {
        public String firstName;
        public String lastName;
        public int age;

        // methods of objects of main
        public void printFirstName () {
                System.out.println(firstName);
        }
        public void printLastName () {
                System.out.println(lastName);
        }
        public void printAge () {
                System.out.println(age);
        }

        // methods with parameters of objects of main
        public void printFirstName (String text) {
                System.out.println(text);
        }
        public void printLastName (String text) {
                System.out.println(text);
        }
        public void printAge (String text) {
                System.out.println(text);
        }

        // method with couple of Undefined objects
        public void typo(String welcome, Object... messages) {
                System.out.println(welcome);
                for (Object msg: messages) {
                        System.out.println(msg);
                }
        }

        // methods of objects of main
        public boolean passTest (String subject) {
            return true;
        }

        public boolean isOld (int currentAge) {
                if (currentAge > 50) {
                        return true;
                } else {
                        return false;
                }
        }
}
