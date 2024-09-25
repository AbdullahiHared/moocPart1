import java.time.LocalTime;
public class Items {
    String firstName;
    String lastName;
    LocalTime time;

    public Items (String fName,String lName) {
        this.firstName = fName;
        this.lastName = lName;
        this.time = LocalTime.now();
    }

    public String toString() {
        return this.firstName + " (create at: " + this.time + " )";
    }
}