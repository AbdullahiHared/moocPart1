import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary simpleDictionary = new SimpleDictionary();
        TextUi textUi = new TextUi(scanner, simpleDictionary);
        textUi.start();
    }
}