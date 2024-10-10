import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            boolean isPalindrome = true;

            for (int i = 0, j = word.length() - 1; i < j; i++, j--) {
                if (word.charAt(i) != word.charAt(j)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Palindrome found!");
                break;
            }
        }
    }
}