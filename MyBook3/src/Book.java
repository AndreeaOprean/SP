import java.util.ArrayList;
import java.util.List;

public class Book {
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

    public void print() {
        System.out.println("Book: "+title);
        System.out.println();
        System.out.println("Authors: ");
        for (Author a: authors) {
            System.out.println("Author: "+a);
        }
        System.out.println();
        for (Element e:elements) {
            e.print();
        }
    }

}
