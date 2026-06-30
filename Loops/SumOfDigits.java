import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, sum = 0, digit;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while (number != 0) {
            digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Sum of Digits = " + sum);

        sc.close();
    }
}

/*
Sample Input:
1234

Output:
Sum of Digits = 10
*/
