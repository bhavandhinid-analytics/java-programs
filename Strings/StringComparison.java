import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String first = sc.nextLine();

        System.out.print("Enter the second string: ");
        String second = sc.nextLine();

        if (first.equals(second)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        sc.close();
    }
}

/*
Sample Input:
Java
Java

Output:
The strings are equal.
*/
