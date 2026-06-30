import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] first = new int[2][2];
        int[][] second = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("Enter elements of the first matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                second[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of the matrices:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
Sample Input:
First Matrix:
1 2
3 4

Second Matrix:
5 6
7 8

Output:
Sum of the matrices:
6 8
10 12
*/
