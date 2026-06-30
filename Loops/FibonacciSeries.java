import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, first = 0, second = 1;

        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}

/*
Sample Input:
7

Output:
Fibonacci Series:
0 1 1 2 3 5 8
*/
