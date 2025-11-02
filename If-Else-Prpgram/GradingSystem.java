import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent!)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (marks >= 50) {
            System.out.println("Grade: D (Needs Improvement)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}
