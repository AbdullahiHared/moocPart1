import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<PersonalInformation> personalInformations = new ArrayList<>();

        // ask user for personal information
        while (true) {
            System.out.println("Please Enter Your first Name");
            String firstName = sc.nextLine();
            System.out.println("Please Enter Your last Name");
            String lastName = sc.nextLine();

            // Check if the firstName is empty to stop the loop
            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Please enter your ID");
            int idNumber = sc.nextInt();
            sc.nextLine();  // Consume the newline after entering the integer

            // Add new PersonalInformation object with firstName, lastName, and id
            personalInformations.add(new PersonalInformation(firstName, lastName));
        }

        // Print all the personal information
        for (PersonalInformation personalInformation : personalInformations) {
            System.out.println(personalInformation);
        }

        sc.close();  // Close the scanner to prevent resource leak
    }
}
