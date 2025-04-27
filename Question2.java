import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        //Write a Java program that calculates the sum of the digits in a number entered by the user using a loop.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
