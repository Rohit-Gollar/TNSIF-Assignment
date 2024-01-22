import java.util.Scanner;

// Class to represent the Sky Airlines message generator
public class SkyAirlinesApp {
    private String name;
    private String source;
    private String destination;

    // Method to get customer information
    public void getCustomerInfo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter name:");
            name = scanner.nextLine();

            System.out.println("Enter source:");
            source = scanner.nextLine();

            System.out.println("Enter destination:");
            destination = scanner.nextLine();
        }
    }

    // Method to generate and print the message
    public void generateAndPrintMessage() {
        System.out.println("Dear " + name + ",");
        System.out.println("Thank you for choosing Sky Airlines for your travel from " + source + " to " + destination + ".");
        System.out.println("We wish you a pleasant journey!");
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of SkyAirlinesApp
        SkyAirlinesApp app = new SkyAirlinesApp();

        // Get customer information
        app.getCustomerInfo();

        // Generate and print the message
        app.generateAndPrintMessage();
    }
}
