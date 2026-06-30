import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum of array elements = " + sum);

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
Sum of array elements = 150
*/
