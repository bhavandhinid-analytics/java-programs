import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter the character to find: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Frequency of '" + ch + "' = " + count);

        sc.close();
    }
}

/*
Sample Input:
programming
g

Output:
Frequency of 'g' = 2
*/
