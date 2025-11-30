public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;

        // Count digits
        int digits = 0;
        for (int i = number; i != 0; i /= 10) {
            digits++;
        }

        // Calculate Armstrong sum
        for (int i = number; i != 0; i /= 10) {
            int digit = i % 10;
            int power = 1;

            for (int j = 0; j < digits; j++) {
                power *= digit;
            }

            sum += power;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }
    }
}
