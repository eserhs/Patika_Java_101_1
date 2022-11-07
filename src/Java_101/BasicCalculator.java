package Java_101;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter the second number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter the math operator you want to perform. " +
                "You can select and enter addition, subtraction, multiplication, division or remainder operator: ");
        char mathOperator = scanner.nextLine().charAt(0);

        switch (mathOperator) {

            case '+':
                System.out.println("Addition operator selected.");
                System.out.println("The result of the addition is: " + (firstNumber + secondNumber));
                break;
            case '-':
                System.out.println("Subtraction operator selected.");
                System.out.println("The result of the subtraction is: " + (firstNumber - secondNumber));
                break;
            case '*':
                System.out.println("Multiplication operator selected.");
                System.out.println("The result of the multiplication is: " + (firstNumber * secondNumber));
                break;
            case '/':
                System.out.println("Division operator selected.");
                System.out.println("The result of the division is: " + (firstNumber / secondNumber));
                break;
            case '%':
                System.out.println("Remainder operator selected.");
                System.out.println("The result of the remainder is: " + (firstNumber % secondNumber));
            default:
                System.out.println("You entered an invalid math operator.");
                break;

        }
    }
}
