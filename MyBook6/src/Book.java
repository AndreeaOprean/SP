import java.util.ArrayList;
import java.util.List;

public class Book implements Visitee{
    public String title;
    public List<Author> authors = new ArrayList<Author>();
    public List<Element> elements = new ArrayList<Element>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author rpGheo) {
        this.authors.add(rpGheo);
    }

    public void addContent(Element e) {elements.add(e);}

    public void accept(Visitor v) {
        v.visit(this);
        for (Element e:elements) {
            e.accept(v);
        }
    }

}
