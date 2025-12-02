import java.util.Scanner;

public class LoginAuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "12345";

        System.out.print("Enter Username: ");
        String user = sc.next();

        System.out.print("Enter Password: ");
        String pass = sc.next();

        if (user.equals(correctUser) && pass.equals(correctPass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials!");
        }
    }
}
