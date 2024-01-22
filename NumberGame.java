import java.util.Scanner;

// Class to represent the NumberGame
public class NumberGame {
    private int number1;
    private int number2;
    private int number3;

    // Method to get three numbers from the user
    public void getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        number3 = scanner.nextInt();
    }

    // Method to find and print the smallest number
    public void findSmallestNumber() {
        int smallestNumber = (number1 <= number2) ? ((number1 <= number3) ? number1 : number3) : ((number2 <= number3) ? number2 : number3);

        if (number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("The smallest number is: " + smallestNumber);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of NumberGame
        NumberGame numberGame = new NumberGame();

        // Get three numbers from the user
        numberGame.getNumbers();

        // Find and print the smallest number
        numberGame.findSmallestNumber();
    }
}