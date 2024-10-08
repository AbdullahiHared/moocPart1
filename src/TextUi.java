import java.util.ArrayList;
import java.util.Scanner;

public class TextUi {
    private Scanner scanner;
    private ArrayList<String> list;

    public TextUi(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.list = simpleDictionary.get();
    }

    public void start() {
        while(true) {
            System.out.println("Command:");
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "end":
                    System.out.println("Bye bye!");
                    return;
                case "add":
                    add();
                    break;
                case "search":
                    search();
                    break;
                case "list":
                    printList();
                    break;
                case "change":
                    change();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

    public void printList() {
        if (list.isEmpty()) {
            System.out.println("Empty list");
            return;
        }

        for (String text : list) {
            String word = text.split(" ")[0];
            String translation = text.split(" ")[1];
            System.out.println(word + " = " + translation);
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = scanner.nextLine();
        list.add(word + " " + translation);
    }

    public void search() {
        System.out.print("Search for: ");
        String searchWord = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (String word : list) {
            String currentWord = word.split(" ")[0].toLowerCase();
            String currentTranslation = word.split(" ")[1].toLowerCase();

            if (currentWord.equals(searchWord)) {
                System.out.println("Translation: " + currentTranslation);
                found = true;
            } else if (currentTranslation.equals(searchWord)) {
                System.out.println("Translation: " + currentWord);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Translation: NULL");
        }
    }


    public void change() {
        System.out.println("Give a word to change: ");
        String wordToChange = scanner.nextLine().toLowerCase();
        for (String word : list) {
            String currentWord = word.split(" ")[0].toLowerCase();
            String currentTranslation = word.split(" ")[1].toLowerCase();
            if(currentWord.equals(wordToChange) || currentTranslation.equals(wordToChange)) {
                System.out.print("Give a new translation: ");
                String newTranslation = scanner.nextLine();
                list.set(list.indexOf(word), currentWord + " = " + newTranslation);
                return;
            }

            System.out.println("Word " + wordToChange + " not found");
        }
    }

}