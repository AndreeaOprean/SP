import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    public String title;
    public ArrayList<String> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void createNewParagraph(String paragraph) {
        this.contents.add(paragraph);
    }

    public void createNewImage(String image) {
        this.contents.add(image);
    }

    public void createNewTable(String table) {
        this.contents.add(table);
    }

    @Override
    public String toString() {
        return "MyBook" + '\n' +
                "Title : " + title + '\n' +
                "Contents : " + contents;
    }

    public void print() {
        System.out.println(this);
    }
}
