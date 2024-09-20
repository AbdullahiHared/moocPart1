import java.util.Scanner;
import java.util.ArrayList;import java.util.List;
//package tools;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please give a year to check");
        int userInput = sc.nextInt();

        if((userInput % 400 == 0) || (userInput % 4 == 0) && (userInput % 100 != 0)) {
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
}