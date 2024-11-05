import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

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
                    System.out.printf("Result is: " + adding);
                    break;
                case 2:
                    int subtracting = subtract(secondNumber, firstNumber);
                    System.out.printf("Result is: " + subtracting);
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
            break;

        }




        // Code works, although not the output I'm wanting.
        // I want the menu to run first, then once the user has selected an option.
        // The program will calculate the value and print it off the user
        // If you run the program, it will show you the mess I'm on about.






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