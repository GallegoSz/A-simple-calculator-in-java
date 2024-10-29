import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nCalculator!");

        while (true) {
            System.out.print("\nEnter the first number: ");
            double num1 = scn.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scn.nextDouble();

            System.out.print("Enter the operation (+, -, *, /, ^): ");
            char operation = scn.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case '^':
                    if (num1 == 0 && num2 == 0) {
                        System.out.println("Error: 0 raised to the power of 0 is not allowed.");
                        continue;
                    }
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation, please try again.");
                    continue;
            }


            System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);


            System.out.print("Do you want to perform another calculation? (yes/no):");
            String response = scn.next();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        scn.close();
        System.out.println("\nThank you for using the calculator! Goodbye.");
    }
}


