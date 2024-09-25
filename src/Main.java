import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();

        // ask user for personal information
        while (true) {
            System.out.println("Please Enter the book title");
            String bookTitle = sc.nextLine();

            // Check if the name of the book is empty to stop the loop
            if (bookTitle.isEmpty()) {
                break;
            }

            System.out.println("Book pages? ");
            int bookPages = sc.nextInt();
            sc.nextLine();  // Consume the newline after entering the integer

            System.out.println("Book publication year? ");
            int publishYear = sc.nextInt();
            sc.nextLine();  // Consume the newline after entering the integer

            // Add new PersonalInformation object with firstName, lastName, and id
            books.add(new Books(bookTitle, bookPages, publishYear ));
        }

        System.out.println("Please choose what to print ");
         String userChoice = sc.nextLine().toLowerCase();

        // Print all television programs that fulfill the maximum duration
        for (Books book : books) {
            switch (userChoice) {
                case "everything" -> System.out.println(book.printEverything());
                case "title" -> System.out.println(book.printTitle());
                case "year" -> System.out.println(book.printPublicationYear());
            }
        }

        sc.close();  // Close the scanner to prevent resource leak
    }
}
