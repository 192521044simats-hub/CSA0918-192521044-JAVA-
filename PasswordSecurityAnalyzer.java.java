import java.util.Scanner;

public class PasswordSecurityAnalyzer {

    public static int calculateScore(int length, int categories) {
        return length * categories;
    }

    public static String getRating(int score) {
        if (score >= 80)
            return "Very Strong";
        else if (score >= 60)
            return "Strong";
        else if (score >= 40)
            return "Medium";
        else
            return "Weak";
    }

    public static void displayResult(int length, int categories, int score, String rating) {
        System.out.println("\n----- PASSWORD SECURITY REPORT -----");
        System.out.println("Password Length        : " + length);
        System.out.println("Character Categories   : " + categories);
        System.out.println("Security Score         : " + score);
        System.out.println("Security Rating        : " + rating);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PASSWORD SECURITY ANALYZER");
        System.out.print("Enter Password Length: ");
        int length = sc.nextInt();

        System.out.print("Enter Number of Character Categories Used: ");
        int categories = sc.nextInt();

        int score = calculateScore(length, categories);
        String rating = getRating(score);

        displayResult(length, categories, score, rating);

        sc.close();
    }
}
