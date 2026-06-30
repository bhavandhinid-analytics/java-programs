import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        long factorial = 1;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);

        sc.close();
    }
}

/*
Sample Input:
5

Output:
Factorial of 5 = 120
*/
