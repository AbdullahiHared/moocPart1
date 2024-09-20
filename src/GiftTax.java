import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Read input from user
            String input = sc.nextLine();

            // If the input is empty, break the loop
            if (input.equals("")) {
                break;
            }

            // Split the input string by spaces
            String[] pieces = input.split(" ");

            // Print the first part of the split string
            if (pieces.length > 0) {
                String last = pieces[pieces.length-1];
                System.out.println(last);
            }
        }
    }
}
