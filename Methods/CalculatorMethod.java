import java.util.Scanner;

public class CalculatorMethod {

    // Method for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + add(num1, num2));
        System.out.println("Subtraction = " + subtract(num1, num2));
        System.out.println("Multiplication = " + multiply(num1, num2));
        System.out.println("Division = " + divide(num1, num2));

        sc.close();
    }
}

/*
Sample Input:
20
5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4.0
*/
