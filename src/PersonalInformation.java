import java.time.LocalTime;
public class PersonalInformation {
    String firstName;
    String lastName;
    int idNumber;

    public PersonalInformation (String fName,String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}