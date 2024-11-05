import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        // Future task = Ask the user once the result is printed if they'd like to do the program to run again!

        // This program, is a calculator that asks the user to enter an option and will calculate the value.

        while (true) {
            int option = menu();

            if (option == 5) {
                System.out.print("Program will now terminate! ");
                break;
            }

            System.out.print("Enter first number: ");
            int firstNumber = stdin.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = stdin.nextInt();


            switch (option) {
                case 1:
                    int adding = add(firstNumber, secondNumber);
                    System.out.printf("You entered " + firstNumber + " + " + secondNumber + " = %d\n", adding);
                    break;
                case 2:
                    int subtracting = subtract(secondNumber, firstNumber);
                    System.out.printf("You entered " + secondNumber + " - " + firstNumber + " = %d\n", subtracting);
                    break;
                case 3:
                    int multiplication = multiply(firstNumber, secondNumber);
                    System.out.printf("You entered " + firstNumber + " * " + secondNumber + " = %d\n", multiplication);
                    break;
                case 4:
                    int division = divide(secondNumber, firstNumber);
                    System.out.printf("You entered " + secondNumber + " / " + firstNumber + " = %d\n", division);
                    break;
            }

            // Asks the program if they want to continue
            System.out.println("Would you like to run the program again? Y/N: ");
            String userChoice = stdin.next();

            if (!userChoice.equalsIgnoreCase("Y")) {
                System.out.println("The program will now terminate! - Thanks for using the program.");
                break;
            }

        }
    }

    // Creating functionality:

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num2 - num1;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int divide(int num1, int num2) {
        return num2 / num1;
    }

    // Selecting the option function
    static int selectOption() {
        int numberEntered = 0;
        boolean readNumber = true;

        // Check number pattern, that will keep asking the user for a number
        while (readNumber) {
            System.out.print("Select an option: ");

            try {
                numberEntered = Integer.parseInt(stdin.nextLine());
                //System.out.println("You're input is valid!");
                readNumber = false;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number, try again:\n ");
            }
        }

        return numberEntered;

    }

    static int displayMenu() {
        System.out.println("Welcome to my calculator!");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");


        return selectOption();
    }

    static int menu() {

        return displayMenu();
    }
}