import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, originalNumber, reverse = 0, remainder;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        originalNumber = number;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a Palindrome Number.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome Number.");
        }

        sc.close();
    }
}

/*
Sample Input:
121

Output:
121 is a Palindrome Number.
*/
