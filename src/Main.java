import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.printf("Enter first number: ");
        int firstNumber = stdin.nextInt();

        System.out.printf("Enter second number: ");
        int secondNumber = stdin.nextInt();



        switch (displayMenu()) {
            case 1:
                System.out.printf("Result is: " + add(firstNumber, secondNumber));
                break;
            case 2:
                System.out.printf("Result is: " + subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.printf("Result is: " + multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.printf("Result is: " + divide(firstNumber, secondNumber));
                break;
            case 5:
                System.out.print("Program will now terminate!");
                break;

        }

        int option = menu();


        //int result = add(3, 5);
        //System.out.println(result);

        //int subResult = subtract(5, 3);
        //System.out.println(subResult);

        //int multiplyResult = multiply(5, 5);
        //System.out.println(multiplyResult);

        //int divideResult = divide(20, 5);
        //System.out.println(divideResult);


        //selectOption();

        //displayMenu();



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
                System.out.println("You're input is valid!");
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