import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int largest;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element = " + largest);

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
Largest element = 67
*/
