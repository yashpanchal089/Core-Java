import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 5) {
            System.out.println("Ticket Price: Free");
        } else if (age <= 18) {
            System.out.println("Ticket Price: ₹150");
        } else if (age <= 60) {
            System.out.println("Ticket Price: ₹250");
        } else {
            System.out.println("Ticket Price: ₹120 (Senior Citizen Discount)");
        }
    }
}
