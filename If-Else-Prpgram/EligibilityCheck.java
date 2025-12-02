import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18 && age < 25) {
            System.out.println("You can Vote and apply for Driving License.");
        } else if (age >= 25) {
            System.out.println("You can Vote, Drive, and apply for all licenses.");
        } else {
            System.out.println("You are not eligible yet.");
        }
    }
}
