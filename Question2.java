import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}
