import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {

            System.out.println("\n==========================");
            System.out.println(" JAVA CALCULATOR");
            System.out.println("==========================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 8) {
                System.out.println("Thank you!");
                break;
            }

            try {

                double num1, num2;

                switch (choice) {

                    case 1:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calc.add(num1, num2));
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calc.subtract(num1, num2));
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calc.multiply(num1, num2));
                        break;

                    case 4:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calc.divide(num1, num2));
                        break;

                    case 5:
                        System.out.print("Enter first number: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter second number: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calc.modulus(num1, num2));
                        break;

                    case 6:
                        System.out.print("Enter base: ");
                        num1 = sc.nextDouble();

                        System.out.print("Enter exponent: ");
                        num2 = sc.nextDouble();

                        System.out.println("Result = " + calc.power(num1, num2));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        num1 = sc.nextDouble();

                        System.out.println("Result = " + calc.squareRoot(num1));
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
