public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221;
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is not a Palindrome Number.");
        }
    }
}
