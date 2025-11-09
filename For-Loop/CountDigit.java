public class CountDigits {
    public static void main(String[] args) {
        int number = 987654;
        int count = 0;

        for (int i = number; i != 0; i /= 10) {
            count++;
        }

        System.out.println("Total digits in " + number + " = " + count);
    }
}
