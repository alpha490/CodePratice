package striversa2z;

public class BasicMath {

    public static void main(String[] args) {
        BasicMath bm = new BasicMath();
        System.out.println(bm.countDigit(119663)); // Expected output: 6
        System.out.println(bm.countDigit(1196));   // Expected output: 4

        // Calling the overloaded main method
        BasicMath.main("Overloaded main method");
        BasicMath.main("Overloaded", "main", "method");
    }

    // Overloaded main method with one String parameter
    public static void main(String arg) {
        System.out.println("Overloaded main method with one String parameter: " + arg);
    }

    // Overloaded main method with three String parameters
    public static void main(String arg1, String arg2, String arg3) {
        System.out.println("Overloaded main method with three String parameters: " + arg1 + ", " + arg2 + ", " + arg3);
    }

    public int countDigit(int a) {
        int count = 0; // Use a local variable instead of a static field
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
}
