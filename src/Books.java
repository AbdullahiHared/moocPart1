import java.time.LocalTime;
public class Books {
    String title;
    int pages;
    int publicationYear;

    public Books (String title, int pages, int publicationYear) {
        this.pages = pages;
        this.title = title;
        this.publicationYear = publicationYear;
    }



    public String printEverything() {
        return this.title + ", " + this.pages + " pages " + this.publicationYear;
    }

    public String printTitle() {
        return this.title;
    }

    public int printPublicationYear() {
        return this.publicationYear;
    }

    public int pages() {
        return this.pages;
    }
}