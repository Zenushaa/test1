
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Write a Java program to reverse a word provided by the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word here: ");
        String word = scanner.nextLine();
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("The reversed word is: " + reversedWord);
    }
}
