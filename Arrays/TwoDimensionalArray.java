import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        System.out.println("Enter the elements of the 2x2 matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered matrix is:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Sample Input:
1 2
3 4

Output:
The entered matrix is:
1 2
3 4
*/
