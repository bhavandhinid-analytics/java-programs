import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        double average = total / 3.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average = " + average);

        if (average >= 90) {
            System.out.println("Grade A");
        } else if (average >= 75) {
            System.out.println("Grade B");
        } else if (average >= 60) {
            System.out.println("Grade C");
        } else if (average >= 50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
