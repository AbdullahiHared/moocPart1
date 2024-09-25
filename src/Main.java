import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalTime;
import java.util.List;
//package tools;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();


        // ask user for personal information
        while(true) {
            System.out.println("Please Enter Your first Name");
            String firstName = sc.nextLine();
            System.out.println("Please Enter Your last Name");
            String lastName = sc.nextLine();
            if(firstName.isEmpty()) {
                break;
            }

            items.add(new Items(firstName, lastName));
        }

        for(Items item : items) {
            System.out.println(item);
        }

    }
}

