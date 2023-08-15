import java.util.Scanner;

public class EmailSearch {
    public static void main(String[] args) {
        // Array of email IDs
        String[] emailIds = {
            "john.doe@example.com",
            "jane.smith@example.org",
            "bob.jones@example.net",
            "sarah.connor@example.co"
        };

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter an email ID to search
        System.out.print("Please enter the email ID to search: ");
        String searchEmail = scanner.nextLine();

        // Use a boolean variable to keep track if the email is found
        boolean isEmailFound = false;

        // Loop through the emailIds array and search for the email
        for (String email : emailIds) {
            if (email.equalsIgnoreCase(searchEmail)) {
                isEmailFound = true;
                break;
            }
        }

        // Check if the email was found or not
        if (isEmailFound) {
            System.out.println("The email ID " + searchEmail + " was found in the array.");
        } else {
            System.out.println("The email ID " + searchEmail + " was not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
