import java.util.Scanner;

public class StringCharacterAnalysis {

    public static void analyzeString(String text) {

        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int spaces = 0;
        int special = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (Character.isUpperCase(ch))
                uppercase++;
            else if (Character.isLowerCase(ch))
                lowercase++;
            else if (Character.isDigit(ch))
                digits++;
            else if (Character.isWhitespace(ch))
                spaces++;
            else
                special++;
        }

        System.out.println("\n----- STRING ANALYSIS REPORT -----");
        System.out.println("Input String          : " + text);
        System.out.println("Uppercase Letters     : " + uppercase);
        System.out.println("Lowercase Letters     : " + lowercase);
        System.out.println("Digits                : " + digits);
        System.out.println("Spaces                : " + spaces);
        System.out.println("Special Characters    : " + special);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("STRING CHARACTER ANALYZER");
        System.out.print("Enter a String: ");

        String text = sc.nextLine();

        analyzeString(text);

        sc.close();
    }
}
