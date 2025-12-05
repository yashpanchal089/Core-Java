import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly salary: ");
        int salary = sc.nextInt();

        if (age >= 21 && salary >= 20000) {
            System.out.println("Eligible for loan.");
        } else if (age >= 21 && salary < 20000) {
            System.out.println("Age is OK, but salary is too low.");
        } else {
            System.out.println("Not eligible for loan.");
        }
    }
}
