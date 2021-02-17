package practics08;
//Overloading
public class Addition {
    //Addition of two integers
    public int add(int x, int y){
        return x + y;
    }
    //Addition of three integers
    public int add(int x, int y, int z){
        return x + y + z;
    }
    //Addition of double values
    public double add(double x, double y){
        return x + y;
    }

    public static void main (String args[]){
        Addition a = new Addition();
        System.out.println(a.add(24, 24));
        System.out.println(a.add(24, 24, 24));
        System.out.println(a.add(12.24, 12.24));
    }
}
