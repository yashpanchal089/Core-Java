public class MaxNumber {
    public static void main(String[] args) {
        int[] numbers = {15, 85, 42, 97, 63};
        int max = numbers[0];

        // Using for-each loop to find maximum value
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}
