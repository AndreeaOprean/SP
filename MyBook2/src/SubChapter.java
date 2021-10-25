import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    public List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    public List<Image> images = new ArrayList<Image>();
    public List<Table> tables = new ArrayList<Table>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        Paragraph p = new Paragraph(s);
        this.paragraphs.add(p);
    }

    public void createNewImage(String s) {
        Image i = new Image(s);
        this.images.add(i);
    }

    public void createNewTable(String s) {
        Table t = new Table(s);
        this.tables.add(t);
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
