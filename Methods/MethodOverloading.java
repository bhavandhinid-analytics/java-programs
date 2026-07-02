public class MethodOverloading {

    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of two integers: " + add(10, 20));
        System.out.println("Sum of three integers: " + add(10, 20, 30));
        System.out.println("Sum of two double values: " + add(10.5, 20.5));
    }
}

/*
Output:
Sum of two integers: 30
Sum of three integers: 60
Sum of two double values: 31.0
*/
