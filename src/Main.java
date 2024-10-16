import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "The family of Dashwood had long been settled in Sussex.");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "It is a truth universally acknowledged, that a ...");

        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);


        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
    }
}