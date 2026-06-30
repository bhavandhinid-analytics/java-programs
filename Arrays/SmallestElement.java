import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int smallest;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest element = " + smallest);

        sc.close();
    }
}

/*
Sample Input:
12
45
23
67
34

Output:
Smallest element = 12
*/
