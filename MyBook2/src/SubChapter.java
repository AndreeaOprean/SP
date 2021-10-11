import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public List<String> paragraphs = new ArrayList<String>();
    public List<String> images = new ArrayList<String>();
    public List<String> tables = new ArrayList<String>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        this.paragraphs.add(s);
    }

    public void createNewImage(String s) {
        this.images.add(s);
    }

    public void createNewTable(String s) {
        this.tables.add(s);
    }

    @Override
    public String toString() {
        return "SubChapter: " + name + ' ' +
                "Paragraphs: " + paragraphs + ' ' +
                "Images: " + images + ' ' +
                "Tables: " + tables;
    }

    public void print() {
        System.out.println(this);
    }
}
