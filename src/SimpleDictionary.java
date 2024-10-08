import java.util.ArrayList;

public class SimpleDictionary {
    private ArrayList<String> texts;

    public SimpleDictionary() {
       this.texts = new ArrayList<>();
    }

    public void add(String text) {
        this.texts.add(text);
    }

    public ArrayList<String> get() {
        return this.texts;
    }
}