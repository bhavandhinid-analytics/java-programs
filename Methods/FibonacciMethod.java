import java.util.Scanner;

public class FibonacciMethod {

    // Method to print Fibonacci series
    static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();

        printFibonacci(terms);

        sc.close();
    }
}

/*
Sample Input:
7

Output:
Fibonacci Series: 0 1 1 2 3 5 8
*/
