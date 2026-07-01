import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int length = text.length();

        System.out.println("Length of the string: " + length);

        sc.close();
    }
}

/*
Sample Input:
Hello World

Output:
Length of the string: 11
*/
