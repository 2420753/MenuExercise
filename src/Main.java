import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {


        //int result = add(3, 5);
        //System.out.println(result);

        //int subResult = subtract(5, 3);
        //System.out.println(subResult);

        //int multiplyResult = multiply(5, 5);
        //System.out.println(multiplyResult);

        //int divideResult = divide(20, 5);
        //System.out.println(divideResult);


        selectOption();



    }

    // Creating functionality:

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int divide(int num1, int num2) {
        return num1 / num2;
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
                System.out.print("Invalid number, try again:\n ");

            }

        }


        return numberEntered;

    }


}