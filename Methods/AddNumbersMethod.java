import java.util.Scanner;

public class AddNumbersMethod {

    // Method to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = add(num1, num2);

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

/*
Sample Input:
10
20

Output:
Sum = 30
*/
