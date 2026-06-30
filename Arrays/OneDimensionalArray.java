import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}

/*
Sample Input:
10
20
30
40
50

Output:
Array Elements:
10 20 30 40 50
*/
