import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a voter ID? (true/false): ");
        boolean voterId = sc.nextBoolean();

        System.out.println("Eligible to vote: " + (age >= 18 && voterId));
        System.out.println("Minor or no voter ID: " + (age < 18 || !voterId));
        System.out.println("Voter ID status reversed: " + (!voterId));
    }
}
