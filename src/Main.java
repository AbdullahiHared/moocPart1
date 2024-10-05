import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();

        UserInterface userInterface = new UserInterface(set, scanner);
        userInterface.start();
    }
}