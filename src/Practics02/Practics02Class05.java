package practics02;

public class Practics02Class05 {
    public static void main (String args[]) {

        double[] numlist = {101.0, 405.5, 310.5};

        for (int i = 0; i < numlist.length; i++){
            System.out.println(numlist[i]);
        }

        double sum = 0;
        for (int i = 0; i < numlist.length; i++){
            sum = sum + numlist[i];
        }
        System.out.println("Sum is: "+ sum);

        double max = numlist[0];
        for (int i = 0; i < numlist.length; i++){
            if (numlist[i] > max){
                max = numlist[i];
            }
        }
        System.out.println("Max number is " + max);
    }
}
