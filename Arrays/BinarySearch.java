import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int key;
        int low = 0, high = numbers.length - 1;
        boolean found = false;

        System.out.println("Enter 5 elements in ascending order:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        key = sc.nextInt();

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == key) {
                System.out.println("Element found at position " + (mid + 1));
                found = true;
                break;
            } else if (numbers[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
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
40

Output:
Element found at position 4
*/
