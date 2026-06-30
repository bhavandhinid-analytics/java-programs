import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int key;
        boolean found = false;

        System.out.println("Enter 5 elements:");

        // Read array elements
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        key = sc.nextInt();

        // Linear Search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
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
30

Output:
Element found at position 3
*/
