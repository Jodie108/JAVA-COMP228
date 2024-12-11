public class OverloadMethods {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two integers: " + add(2, 3));
        System.out.println("Sum of three integers: " + add(1, 2, 3));
        System.out.println("Sum of two doubles: " + add(2.5, 3.5));
    }
}

