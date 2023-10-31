import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Sin");
            System.out.println("8. Cos");
            System.out.println("9. Tan");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        result = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: Invalid input for square root.");
                    }
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    break;
                case 7:
                    System.out.print("Enter angle in radians: ");
                    num1 = scanner.nextDouble();
                    result = Math.sin(num1);
                    break;
                case 8:
                    System.out.print("Enter angle in radians: ");
                    num1 = scanner.nextDouble();
                    result = Math.cos(num1);
                    break;
                case 9:
                    System.out.print("Enter angle in radians: ");
                    num1 = scanner.nextDouble();
                    result = Math.tan(num1);
                    break;
                case 0:
                    System.out.println("Exiting Calculator. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("Result: " + result);
        }
    }
}
