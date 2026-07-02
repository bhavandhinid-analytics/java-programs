import java.util.Scanner;

public class FactorialMethod {

    // Method to calculate factorial
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = factorial(number);

        System.out.println("Factorial = " + result);

        sc.close();
    }
}

/*
Sample Input:
5

Output:
Factorial = 120
*/
