import java.util.Scanner;

// Class to represent the NumberSwapper
public class NumberSwapper {
    private int first;
    private int second;

    // Method to get two numbers from the user
    public void getNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        first = scanner.nextInt();

        System.out.println("Enter the second number:");
        second = scanner.nextInt();
    }

    // Method to swap two numbers using bitwise XOR
    public void swapNumbers() {
        System.out.println("Before swapping: First = " + first + ", Second = " + second);

        // Using bitwise XOR to swap the numbers
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swapping: First = " + first + ", Second = " + second);
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of NumberSwapper
        NumberSwapper numberSwapper = new NumberSwapper();

        // Get two numbers from the user
        numberSwapper.getNumbers();

        // Swap and print the numbers
        numberSwapper.swapNumbers();
    }
}