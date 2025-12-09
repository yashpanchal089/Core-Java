import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 15000;  // initial balance
        int dailyLimit = 10000;

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("❌ Invalid amount! Enter an amount greater than 0.");
        } 
        else if (amount > dailyLimit) {
            System.out.println("❌ Withdrawal failed! Amount exceeds daily limit of ₹" + dailyLimit);
        } 
        else if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } 
        else {
            balance -= amount;
            System.out.println("✅ Withdrawal successful!");
            System.out.println("💰 Remaining Balance: ₹" + balance);
        }
    }
}
