import java.util.Scanner;

public class CharityContact {
    private Scanner scanner;

    public CharityContact() {
        this.scanner = new Scanner(System.in);
    }

    public void contactCharity() {
        System.out.println("Welcome to the Charity Contact System!");

        // Get user input for charity details
        System.out.print("Enter charity name: ");
        String charityName = scanner.nextLine();

        System.out.print("Enter charity type (ANIMAL_WELFARE, ENVIRONMENTAL_CONSERVATION, HUMANITARIAN_AID): ");
        CharityType charityType = CharityType.valueOf(scanner.nextLine());

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

        // Simulate sending message to charity
        System.out.println("Sending message to " + charityName + " (" + charityType + "):");
        System.out.println("Message: " + message);

        // Close scanner
        scanner.close();
    }
}
