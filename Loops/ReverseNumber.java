import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, reverse = 0, remainder;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}

/*
Sample Input:
1234

Output:
Reversed Number = 4321
*/
